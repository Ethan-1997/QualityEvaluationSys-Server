package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.StudentMapper;
import com.qualityevaluationsys.demo.dao.SysuserMapper;
import com.qualityevaluationsys.demo.dao.TeacherMapper;
import com.qualityevaluationsys.demo.domain.*;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.JwtUtil;
import com.qualityevaluationsys.demo.utils.LocalConfig;
import com.qualityevaluationsys.demo.utils.PageBean;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysuserServiceImpl implements SysuserService {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public int deleteByPrimaryKey(Integer uno) {
        return  sysuserMapper.deleteByPrimaryKey(uno);
    }

    @Override
    public int insert(Sysuser record) {
        return sysuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Sysuser record) {
        return sysuserMapper.insertSelective(record);
    }

    @Override
    public Sysuser selectByPrimaryKey(Integer uno) {
        return sysuserMapper.selectByPrimaryKey(uno);
    }

    @Override
    public int updateByPrimaryKeySelective(Sysuser record) {
        return sysuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sysuser record) {
        return sysuserMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageBean getPageBean(Integer page, Integer limit, String sort, Sysuser sysuser) {
        SysuserExample sysuserExample=new SysuserExample();
        SysuserExample.Criteria criteria = sysuserExample.createCriteria();
        if(!StringUtils.isNullOrEmpty(sysuser.getUname())){
            criteria.andUnameLike("%"+sysuser.getUname()+"%");
        }
        if(!StringUtils.isNullOrEmpty(sysuser.getUtype())){
            criteria.andUtypeEqualTo(sysuser.getUtype());
        }
        if(sort!=null){
            if(sort.equals("-id")){
                sysuserExample.setOrderByClause("uno desc");
            }else{
                sysuserExample.setOrderByClause("uno asc");
            }
        }


        int count = (int) sysuserMapper.countByExample(sysuserExample);
        PageBean pageBean=new PageBean(page,count,limit);
        sysuserExample.setLimit(limit);
        sysuserExample.setOffset(pageBean.getStart());
        pageBean.setList(sysuserMapper.selectByExample(sysuserExample));
        return pageBean;
    }

    @Override
    public String login(Sysuser user) throws RuntimeException {
        SysuserExample example=new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        if(user!=null){
            if(user.getUname()!=null){
                criteria.andUnameEqualTo(user.getUname());
                if(user.getUpassword()!=null){
                    criteria.andUpasswordEqualTo(user.getUpassword());
                    List<Sysuser> sysusers = sysuserMapper.selectByExample(example);
                    if(sysusers!=null&&sysusers.size()!=0){
                        Sysuser sysuser = sysusers.get(0);
                        JwtUtil jwtUtil=new JwtUtil();
                        try {
                            return jwtUtil.createJWT(sysuser.getUno().toString(), sysuser.getUname(), 1000 * 60*60);
                        } catch (Exception e) {
                           throw new RuntimeException(e.getMessage()) ;
                        }
                    }else
                    {
                        throw new RuntimeException("账号或者密码错误！") ;
                    }
                }else{
                    throw new RuntimeException("密码不能为空！") ;
                }
            }else{
                throw new RuntimeException("用户名不能为空！") ;
            }
        }


        //判断密码
        //获取权限
        //TODO 判断身份类别然后返回权限
        return null;
    }

    @Override
    public Sysuser info(String token) {
        JwtUtil jwtUtil=new JwtUtil();
        try {
            Claims claims = jwtUtil.parseJWT(token);
            Sysuser sysuser = sysuserMapper.selectByPrimaryKey(Integer.valueOf(claims.getId()));
            if(sysuser.getUtype().equals("老师")){
                TeacherExample example=new TeacherExample();
                TeacherExample.Criteria criteria = example.createCriteria();
                criteria.andUnoEqualTo(sysuser.getUno());
                List<Teacher> teachers = teacherMapper.selectByExample(example);
                LocalConfig.ID= teachers.get(0).getTno().toString();
            }else if(sysuser.getUtype().equals("学生")){
                StudentExample example=new StudentExample();
                StudentExample.Criteria criteria = example.createCriteria();
                criteria.andUnoEqualTo(sysuser.getUno());

                List<Student> students = studentMapper.selectByExample(example);
                LocalConfig.ID= students.get(0).getSid();
            }
            return sysuser;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getCurrentUser(String token) {
        JwtUtil jwtUtil=new JwtUtil();
        try {
            Claims claims = jwtUtil.parseJWT(token);
            Sysuser sysuser = sysuserMapper.selectByPrimaryKey(Integer.valueOf(claims.getId()));
            if(sysuser.getUtype().equals("老师")){
                TeacherExample example=new TeacherExample();
                TeacherExample.Criteria criteria = example.createCriteria();
                criteria.andUnoEqualTo(sysuser.getUno());
                List<Teacher> teachers = teacherMapper.selectByExample(example);
                LocalConfig.ID= teachers.get(0).getTno().toString();
                return  teachers.get(0);
            }else if(sysuser.getUtype().equals("学生")){
                StudentExample example=new StudentExample();
                StudentExample.Criteria criteria = example.createCriteria();
                criteria.andUnoEqualTo(sysuser.getUno());
                List<Student> students = studentMapper.selectByExample(example);
                LocalConfig.ID= students.get(0).getSid();
                return  students.get(0);
            }
            return null;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> getRole(Sysuser user) {
        SysuserExample example=new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        criteria.andUnameEqualTo(user.getUname());
        criteria.andUpasswordEqualTo(user.getUpassword());
        List<Roles> rolesByGid = sysuserMapper.getRolesByUno(sysuserMapper.selectByExample(example).get(0).getUno());
        ArrayList<String> list=new ArrayList<String>();
        if(list!=null){
            for (Roles r:
                    rolesByGid) {
                list.add(r.getRole());
            }
        }
        return list;
    }


}

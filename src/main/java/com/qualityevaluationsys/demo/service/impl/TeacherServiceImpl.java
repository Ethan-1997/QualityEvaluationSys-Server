package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.SysuserMapper;
import com.qualityevaluationsys.demo.dao.TeacherMapper;
import com.qualityevaluationsys.demo.domain.StudentExample;
import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.domain.Teacher;
import com.qualityevaluationsys.demo.domain.TeacherExample;
import com.qualityevaluationsys.demo.service.TeacherService;
import com.qualityevaluationsys.demo.utils.GroupType;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private SysuserMapper sysuserMapper;
    @Override
    public int deleteByPrimaryKey(Integer tno) {
        return teacherMapper.deleteByPrimaryKey(tno);
    }

    @Override
    public int insertSelective(Teacher record) {
        //TODO 事务优化
        //默认账号密码
        Sysuser sysuser = new Sysuser();
        sysuser.setUname(record.getTtel());
        sysuser.setUpassword("123456");
        sysuser.setUtype("老师");
        sysuserMapper.insert(sysuser);
        //用户表插入记录返回id
        int insertId = sysuserMapper.lastInsertId();
        //插入权限
        sysuserMapper.addRole(insertId, GroupType.TEACHER.ordinal());
        record.setUno(insertId);
        return teacherMapper.insertSelective(record);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Teacher teacher) {
        TeacherExample example=new TeacherExample();
        if(teacher!=null){
            TeacherExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(teacher.getTname())){
                criteria.andTnameLike("%"+teacher.getTname()+"%");
            }
            if(!StringUtils.isNullOrEmpty(teacher.getTsex())){
                criteria.andTsexEqualTo(teacher.getTsex());
            }
        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("tno desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("tno asc");
        }

        int count = (int) teacherMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(teacherMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public Teacher selectByPrimaryKey(Integer tno) {
        return teacherMapper.selectByPrimaryKey(tno);
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }
}

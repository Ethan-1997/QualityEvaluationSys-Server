package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import java.util.List;
import com.qualityevaluationsys.demo.dao.StudentMapper;
import com.qualityevaluationsys.demo.dao.SysuserMapper;
import com.qualityevaluationsys.demo.domain.Student;
import com.qualityevaluationsys.demo.domain.StudentExample;
import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.service.StudentService;
import com.qualityevaluationsys.demo.utils.GroupType;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private SysuserMapper sysuserMapper;
    @Override
    public int deleteByPrimaryKey(String sid) {
        return studentMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public List selectByCid(Integer cid) {
        return studentMapper.selectByCid(cid);
    }

    @Override
    public List selectall() {
        return studentMapper.selectall();
    }

    @Override
    public int insert(Student record) {

        //TODO 事务优化
        //TODO 插入面试成绩基本记录
        //默认账号密码
        Sysuser sysuser = new Sysuser();
        sysuser.setUname(record.getStel());
        sysuser.setUpassword("123456");
        sysuser.setUtype("学生");
        sysuserMapper.insert(sysuser);
        //用户表插入记录返回id
        int insertId = sysuserMapper.lastInsertId();
        //插入权限
        sysuserMapper.addRole(insertId, GroupType.STUDENT.ordinal());
        record.setUno(insertId);
        return studentMapper.insertSelective(record);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Student student) {
        StudentExample example=new StudentExample();
        if(student!=null){
            StudentExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(student.getSname())){
                criteria.andSnameLike("%"+student.getSname()+"%");
            }
            if(!StringUtils.isNullOrEmpty(student.getSdept())){
                criteria.andSdeptLike("%"+student.getSdept()+"%");
            }
            if(!StringUtils.isNullOrEmpty(student.getSclass())){
                criteria.andSclassLike("%"+student.getSclass()+"%");
            }
        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("sid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("sid asc");
        }

        int count = (int) studentMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(studentMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public Student selectByPrimaryKey(String sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}

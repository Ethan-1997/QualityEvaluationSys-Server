package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.StudentMapper;
import com.qualityevaluationsys.demo.domain.*;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qualityevaluationsys.demo.dao.StudentTestMapper;
import com.qualityevaluationsys.demo.service.StudentTestService;

import java.util.List;

@Service
public class StudentTestServiceImpl implements StudentTestService {
    @Autowired
    private StudentTestMapper studentTestMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentTestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(StudentTest record) {
        return studentTestMapper.insertSelective(record);
    }

    @Override
    public StudentTest selectByPrimaryKey(Integer id) {
        return studentTestMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, StudentTest studentTest) {
        StudentTestExample example=new StudentTestExample();
        if(studentTest!=null){
            StudentTestExample.Criteria criteria = example.createCriteria();
//            if(!StringUtils.isNullOrEmpty(studentTest.getSid())){
//                criteria.andSidLike("%"+studentTest.getSid()+"%");
//            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("id desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("id asc");
        }

        int count = (int) studentTestMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(studentTestMapper.selectByExample(example));
        return pageBean;
    }



    @Override
    public int updateByPrimaryKeySelective(StudentTest record) {
        return studentTestMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void switchDisplay(Integer cid, String tid,int status) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria1 = studentExample.createCriteria();
        criteria1.andCidEqualTo(cid);
        for (Student student : studentMapper.selectByExample(studentExample)) {
            studentTestMapper.updateByTidAndSid(tid,student.getSid(),status);
        }

    }

    @Override
    public List<StudentTest> listByExample(StudentTest pojo) {
        StudentTestExample example=new StudentTestExample();
        StudentTestExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(pojo.getSid());
        return  studentTestMapper.selectByExample(example);
    }
}

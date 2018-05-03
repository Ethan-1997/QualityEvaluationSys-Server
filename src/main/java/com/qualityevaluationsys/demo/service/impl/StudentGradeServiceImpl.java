package com.qualityevaluationsys.demo.service.impl;

import com.qualityevaluationsys.demo.dao.StudentGradeMapper;
import com.qualityevaluationsys.demo.domain.StudentGrade;
import com.qualityevaluationsys.demo.domain.StudentGradeExample;
import com.qualityevaluationsys.demo.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentGradeServiceImpl implements StudentGradeService {
    @Autowired
    private StudentGradeMapper studentGradeMapper;
    @Override
    public int deleteByExample(StudentGrade example) {
        StudentGradeExample example1=new StudentGradeExample();
        StudentGradeExample.Criteria criteria = example1.createCriteria();
        criteria.andSidEqualTo(example.getSid());
        return studentGradeMapper.deleteByExample(example1);
    }

    @Override
    public int insertSelective(StudentGrade record) {
        return studentGradeMapper.insertSelective(record);
    }

    @Override
    public List<StudentGrade> selectByExample(StudentGrade example) {
        StudentGradeExample example1=new StudentGradeExample();
        StudentGradeExample.Criteria criteria = example1.createCriteria();
        criteria.andSidEqualTo(example.getSid());
        return studentGradeMapper.selectByExample(example1);
    }
    @Override
    public int updateBySid(StudentGrade studentGrade) {
        StudentGradeExample example=new StudentGradeExample();
        StudentGradeExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(studentGrade.getSid());
        return studentGradeMapper.updateByExampleSelective(studentGrade,example);
    }
}

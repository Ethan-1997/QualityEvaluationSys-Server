package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.StudentGrade;
import com.qualityevaluationsys.demo.domain.StudentGradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentGradeService {

    int deleteByExample(StudentGrade example);

    int insertSelective(StudentGrade record);

    List<StudentGrade> selectByExample(StudentGrade example);

    public int updateBySid(StudentGrade studentGrade);

}

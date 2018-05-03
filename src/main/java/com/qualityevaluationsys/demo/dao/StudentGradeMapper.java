package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.StudentGrade;
import com.qualityevaluationsys.demo.domain.StudentGradeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentGradeMapper {
    long countByExample(StudentGradeExample example);

    int deleteByExample(StudentGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentGrade record);

    int insertSelective(StudentGrade record);

    List<StudentGrade> selectByExample(StudentGradeExample example);

    StudentGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentGrade record, @Param("example") StudentGradeExample example);

    int updateByExample(@Param("record") StudentGrade record, @Param("example") StudentGradeExample example);

    int updateByPrimaryKeySelective(StudentGrade record);

    int updateByPrimaryKey(StudentGrade record);
}
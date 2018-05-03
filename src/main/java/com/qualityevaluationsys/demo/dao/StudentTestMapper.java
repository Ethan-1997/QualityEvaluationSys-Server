package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.domain.StudentTestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentTestMapper {
    long countByExample(StudentTestExample example);

    int deleteByExample(StudentTestExample example);

    int insert(StudentTest record);

    int insertSelective(StudentTest record);

    StudentTest selectBySid(String sid);

    int deleteByTid(String tid);

    int updateBySTid(StudentTest record);

    List<StudentTest> selectByExample(StudentTestExample example);

    int updateByExampleSelective(@Param("record") StudentTest record, @Param("example") StudentTestExample example);

    int updateByExample(@Param("record") StudentTest record, @Param("example") StudentTestExample example);
}
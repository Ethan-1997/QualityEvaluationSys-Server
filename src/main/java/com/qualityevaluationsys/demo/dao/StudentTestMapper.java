package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.domain.StudentTestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentTestMapper {
    long countByExample(StudentTestExample example);

    int deleteByExample(StudentTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentTest record);

    int insertSelective(StudentTest record);

    List<StudentTest> selectByExample(StudentTestExample example);

    StudentTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentTest record, @Param("example") StudentTestExample example);

    int updateByExample(@Param("record") StudentTest record, @Param("example") StudentTestExample example);

    int updateByPrimaryKeySelective(StudentTest record);

    int updateByPrimaryKey(StudentTest record);

    void updateByTidAndSid(@Param("tid")String tid, @Param("sid")String sid,  @Param("status")int status);
}
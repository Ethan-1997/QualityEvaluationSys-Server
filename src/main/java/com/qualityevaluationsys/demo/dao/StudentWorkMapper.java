package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.StudentWork;
import com.qualityevaluationsys.demo.domain.StudentWorkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentWorkMapper {
    long countByExample(StudentWorkExample example);

    int deleteByExample(StudentWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentWork record);

    int insertSelective(StudentWork record);

    List<StudentWork> selectByExample(StudentWorkExample example);

    StudentWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentWork record, @Param("example") StudentWorkExample example);

    int updateByExample(@Param("record") StudentWork record, @Param("example") StudentWorkExample example);

    int updateByPrimaryKeySelective(StudentWork record);

    int updateByPrimaryKey(StudentWork record);
}
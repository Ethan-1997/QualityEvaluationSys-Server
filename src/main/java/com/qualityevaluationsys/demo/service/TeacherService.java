package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Teacher;
import com.qualityevaluationsys.demo.domain.TeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherService {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer tno);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer tno);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}

package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.Student;
import com.qualityevaluationsys.demo.domain.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String sid);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByCid(Integer cid);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List selectall();
}
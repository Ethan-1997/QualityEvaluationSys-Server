package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.ITest;
import com.qualityevaluationsys.demo.domain.ITestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ITestMapper {
    long countByExample(ITestExample example);

    int deleteByExample(ITestExample example);

    int deleteByPrimaryKey(String tid);

    int insert(ITest record);

    int insertSelective(ITest record);

    List<ITest> selectByExampleWithBLOBs(ITestExample example);

    List<ITest> selectByExample(ITestExample example);

    ITest selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") ITest record, @Param("example") ITestExample example);

    int updateByExampleWithBLOBs(@Param("record") ITest record, @Param("example") ITestExample example);

    int updateByExample(@Param("record") ITest record, @Param("example") ITestExample example);

    int updateByPrimaryKeySelective(ITest record);

    int updateByPrimaryKeyWithBLOBs(ITest record);

    int updateByPrimaryKey(ITest record);
}
package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.TestInformation;
import com.qualityevaluationsys.demo.domain.TestInformationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestInformationMapper {
    long countByExample(TestInformationExample example);

    int deleteByExample(TestInformationExample example);

    int deleteByPrimaryKey(String tid);

    int insert(TestInformation record);

    int insertSelective(TestInformation record);

    List<TestInformation> selectByExample(TestInformationExample example);

    TestInformation selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") TestInformation record, @Param("example") TestInformationExample example);

    int updateByExample(@Param("record") TestInformation record, @Param("example") TestInformationExample example);

    int updateByPrimaryKeySelective(TestInformation record);

    int updateByPrimaryKey(TestInformation record);
}
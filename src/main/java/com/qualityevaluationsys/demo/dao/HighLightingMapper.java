package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.HighLighting;
import com.qualityevaluationsys.demo.domain.HighLightingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HighLightingMapper {
    long countByExample(HighLightingExample example);

    int deleteByExample(HighLightingExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(HighLighting record);

    int insertSelective(HighLighting record);

    List<HighLighting> selectByExample(HighLightingExample example);

    HighLighting selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") HighLighting record, @Param("example") HighLightingExample example);

    int updateByExample(@Param("record") HighLighting record, @Param("example") HighLightingExample example);

    int updateByPrimaryKeySelective(HighLighting record);

    int updateByPrimaryKey(HighLighting record);
}
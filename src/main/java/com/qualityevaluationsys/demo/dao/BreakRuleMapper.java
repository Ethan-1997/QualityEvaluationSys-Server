package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.domain.BreakRuleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BreakRuleMapper {
    long countByExample(BreakRuleExample example);

    int deleteByExample(BreakRuleExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(BreakRule record);

    int insertSelective(BreakRule record);

    List<BreakRule> selectByExample(BreakRuleExample example);

    BreakRule selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") BreakRule record, @Param("example") BreakRuleExample example);

    int updateByExample(@Param("record") BreakRule record, @Param("example") BreakRuleExample example);

    int updateByPrimaryKeySelective(BreakRule record);

    int updateByPrimaryKey(BreakRule record);
}
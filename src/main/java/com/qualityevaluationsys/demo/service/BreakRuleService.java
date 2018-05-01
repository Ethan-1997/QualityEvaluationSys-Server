package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.domain.BreakRuleExample;
import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BreakRuleService {


    int deleteByPrimaryKey(Integer bid);


    int insertSelective(BreakRule record);


    BreakRule selectByPrimaryKey(Integer bid);

    PageBean getPageBean(Integer limit, String sort, Integer page, BreakRule breakRule);

    int updateByPrimaryKeySelective(BreakRule record);

}

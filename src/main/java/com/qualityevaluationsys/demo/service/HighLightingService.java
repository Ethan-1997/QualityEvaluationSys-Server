package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.domain.HighLighting;
import com.qualityevaluationsys.demo.domain.HighLightingExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HighLightingService {


    int deleteByPrimaryKey(Integer hid);


    int insertSelective(HighLighting record);


    HighLighting selectByPrimaryKey(Integer hid);

    List<HighLighting> selectByExample(HighLighting highLighting);

    int updateByPrimaryKeySelective(HighLighting record);

    PageBean getPageBean(Integer limit, String sort, Integer page, HighLighting highLighting);}

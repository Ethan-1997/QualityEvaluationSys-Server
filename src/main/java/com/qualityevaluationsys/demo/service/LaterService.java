package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.domain.Later;
import com.qualityevaluationsys.demo.domain.LaterExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LaterService {


    int deleteByPrimaryKey(Integer lid);


    int insertSelective(Later record);


    Later selectByPrimaryKey(Integer lid);

    PageBean getPageBean(Integer limit, String sort, Integer page, Later Later);

    int updateByPrimaryKeySelective(Later record);

}

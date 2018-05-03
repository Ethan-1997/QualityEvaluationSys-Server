package com.qualityevaluationsys.demo.service;


import com.qualityevaluationsys.demo.domain.Later;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;

public interface LaterService {


    int deleteByPrimaryKey(Integer lid);


    int insertSelective(Later record);

    List<Later> selectByExample(Later leave);

    Later selectByPrimaryKey(Integer lid);

    PageBean getPageBean(Integer limit, String sort, Integer page, Later Later);

    int updateByPrimaryKeySelective(Later record);

}

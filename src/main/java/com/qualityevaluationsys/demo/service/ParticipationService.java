package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.domain.Participation;
import com.qualityevaluationsys.demo.domain.ParticipationExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParticipationService {


    int deleteByPrimaryKey(Integer pid);


    int insertSelective(Participation record);


    Participation selectByPrimaryKey(Integer pid);

    PageBean getPageBean(Integer limit, String sort, Integer page, Participation participation);

    int updateByPrimaryKeySelective(Participation record);

}

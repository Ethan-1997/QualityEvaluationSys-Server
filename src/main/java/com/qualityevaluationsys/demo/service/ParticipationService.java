package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Participation;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;

public interface ParticipationService {


    int deleteByPrimaryKey(Integer pid);

    int countByStatusAndSid(String status,String sid) throws Exception;

    int insertSelective(Participation record);

    List<Participation> selectByExample(Participation participation, String sort);

    Participation selectByPrimaryKey(Integer pid);

    PageBean getPageBean(Integer limit, String sort, Integer page, Participation participation);

    int updateByPrimaryKeySelective(Participation record);

    Boolean checkSignIn(String date, String sid);
}

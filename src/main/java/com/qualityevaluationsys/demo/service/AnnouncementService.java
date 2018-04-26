package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Announcement;
import com.qualityevaluationsys.demo.domain.AnnouncementExample;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;

public interface AnnouncementService {

    int deleteByPrimaryKey(Integer ano);

    int insert(Announcement record);

    Announcement selectByPrimaryKey(Integer ano);

    int updateByPrimaryKey(Announcement record);

    PageBean getPageBean(Integer limit, String sort, Integer page, Announcement announcement);

    int deleteBathById(List<Integer> ids);
}

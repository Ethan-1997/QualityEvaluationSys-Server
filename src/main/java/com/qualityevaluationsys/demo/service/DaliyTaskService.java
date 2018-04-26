package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.DaliyTask;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;

public interface DaliyTaskService {
    int deleteByPrimaryKey(Integer id);

    int insert(DaliyTask record);

    DaliyTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(DaliyTask record);

    PageBean getPageBean(Integer limit, String sort, Integer page, DaliyTask daliyTask);

    int deleteBathById(List<Integer> ids);
}

package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;

public interface SysuserService {
    int deleteByPrimaryKey(Integer uno);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    Sysuser selectByPrimaryKey(Integer uno);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);

    PageBean getPageBean(Integer page, Integer limit, String sort, Sysuser example);

    String login(Sysuser user);

    Sysuser info(String token);

    Object getCurrentUser(String token);

    List<String> getRole(Sysuser id);
}

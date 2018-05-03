package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.*;
import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaveService {


    int deleteByPrimaryKey(Integer lid);


    int insertSelective(Leave record);

    List<Leave> selectByExample(Leave leave);

    Leave selectByPrimaryKey(Integer lid);

    PageBean getPageBean(Integer limit, String sort, Integer page, Leave leave);

    int updateByPrimaryKeySelective(Leave record);

}

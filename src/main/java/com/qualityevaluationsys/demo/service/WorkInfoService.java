package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.StudentWork;
import com.qualityevaluationsys.demo.domain.WorkInfo;
import com.qualityevaluationsys.demo.domain.WorkInfoExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkInfoService {


    int deleteByPrimaryKey(Integer wid);


    int insertSelective(WorkInfo record) throws Exception;


    WorkInfo selectByPrimaryKey(Integer wid);

    PageBean getPageBean(Integer limit, String sort, Integer page, WorkInfo workInfo);


    int updateByPrimaryKeySelective(WorkInfo record);

}

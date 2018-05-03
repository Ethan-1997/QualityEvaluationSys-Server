package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.ITest;
import com.qualityevaluationsys.demo.domain.ITestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITestService {

    int deleteByPrimaryKey(String tid);

    int insertSelective(ITest record);

    ITest selectByPrimaryKey(String tid);

    int updateByPrimaryKeySelective(ITest record);

}

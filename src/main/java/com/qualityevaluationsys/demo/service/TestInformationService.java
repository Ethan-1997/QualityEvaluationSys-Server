package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.TestInformation;
import com.qualityevaluationsys.demo.domain.TestInformationExample;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;

public interface TestInformationService {
    int deleteByPrimaryKey(String tid);

    int insert(TestInformation record);

    TestInformation selectByPrimaryKey(String tid);

    int updateByPrimaryKey(TestInformation record);

}

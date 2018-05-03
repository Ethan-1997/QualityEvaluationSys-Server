package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.TestInformationMapper;
import com.qualityevaluationsys.demo.domain.TestInformation;
import com.qualityevaluationsys.demo.service.TestInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestInformationServiceImpl  implements TestInformationService{
    @Autowired
    private TestInformationMapper testInformationMapper;

    @Override
    public int deleteByPrimaryKey(String tid) { return testInformationMapper.deleteByPrimaryKey(tid);}

    @Override
    public int insert(TestInformation record) {return testInformationMapper.insert(record);}

    @Override
    public TestInformation selectByPrimaryKey(String tid) {return testInformationMapper.selectByPrimaryKey(tid);}

    @Override
    public int updateByPrimaryKey(TestInformation record) {return testInformationMapper.updateByPrimaryKey(record);}
}
package com.qualityevaluationsys.demo.service.impl;

import com.qualityevaluationsys.demo.dao.ITestMapper;
import com.qualityevaluationsys.demo.domain.ITest;
import com.qualityevaluationsys.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITestServiceImpl implements ITestService {
    @Autowired
    private ITestMapper iTestMapper;

    @Override
    public int deleteByPrimaryKey(String tid) {
        return iTestMapper.deleteByPrimaryKey(tid);
    }

    @Override
    public int insertSelective(ITest record) {
        return iTestMapper.insertSelective(record);
    }

    @Override
    public ITest selectByPrimaryKey(String tid) {
        return iTestMapper.selectByPrimaryKey(tid);
    }

    @Override
    public int updateByPrimaryKeySelective(ITest record) {
        return iTestMapper.updateByPrimaryKeySelective(record);
    }
}

package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.TTMapper;
import com.qualityevaluationsys.demo.domain.TT;
import com.qualityevaluationsys.demo.service.TTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TTServiceImpl implements TTService{
    @Autowired
    private TTMapper ttMapper;

    @Override
    public int deleteByTid(String tid) { return ttMapper.deleteByTid(tid);}

    @Override
    public int insert(TT record) {return ttMapper.insert(record);}

    @Override
    public TT selectByTno(Integer tno) {return ttMapper.selectByTno(tno);}

    @Override
    public int updateByTid(TT record) {return ttMapper.updateByTid(record);}
}

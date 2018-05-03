package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.TT;

public interface TTService {
    int deleteByTid(String tid);

    int insert(TT record);

    TT selectByTno(Integer tno);

    int updateByTid(TT record);
}

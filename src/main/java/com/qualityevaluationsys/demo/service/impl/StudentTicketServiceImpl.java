package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.StudentTicketMapper;
import com.qualityevaluationsys.demo.domain.StudentTicket;
import com.qualityevaluationsys.demo.service.StudentTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentTicketServiceImpl implements StudentTicketService {
    @Autowired
    private StudentTicketMapper studentTicketMapper;

    @Override
    public int deleteBySid(String sid) { return studentTicketMapper.deleteBySid(sid);}

    @Override
    public int insert(StudentTicket record) {return studentTicketMapper.insert(record);}

    @Override
    public List selectByCid(Integer cid) {return studentTicketMapper.selectByCid(cid);}

    @Override
    public int updateBySid(StudentTicket record) {return studentTicketMapper.updateBySid(record);}
}

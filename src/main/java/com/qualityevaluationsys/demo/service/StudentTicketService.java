package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.StudentTicket;

import java.util.List;

public interface StudentTicketService {
    int deleteBySid(String sid);

    int insert(StudentTicket record);

    List selectByCid(Integer cid);

    int updateBySid(StudentTicket record);
}

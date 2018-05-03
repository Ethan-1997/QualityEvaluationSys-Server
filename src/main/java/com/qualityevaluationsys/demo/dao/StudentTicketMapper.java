package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.StudentTicket;
import com.qualityevaluationsys.demo.domain.StudentTicketExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentTicketMapper {
    long countByExample(StudentTicketExample example);

    int deleteByExample(StudentTicketExample example);

    int insert(StudentTicket record);

    int insertSelective(StudentTicket record);

    List<StudentTicket> selectByExample(StudentTicketExample example);

    int updateByExampleSelective(@Param("record") StudentTicket record, @Param("example") StudentTicketExample example);

    int updateByExample(@Param("record") StudentTicket record, @Param("example") StudentTicketExample example);

    int deleteBySid(String sid);

    List selectByCid(Integer cid);

    int updateBySid(StudentTicket record);

}
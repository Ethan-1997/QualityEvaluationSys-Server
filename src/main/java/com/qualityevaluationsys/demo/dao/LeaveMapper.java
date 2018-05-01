package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.Leave;
import com.qualityevaluationsys.demo.domain.LeaveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LeaveMapper {
    long countByExample(LeaveExample example);

    int deleteByExample(LeaveExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExample(LeaveExample example);

    Leave selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}
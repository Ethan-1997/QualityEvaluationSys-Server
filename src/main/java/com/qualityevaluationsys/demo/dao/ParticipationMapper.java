package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.Participation;
import com.qualityevaluationsys.demo.domain.ParticipationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ParticipationMapper {
    long countByExample(ParticipationExample example);

    int deleteByExample(ParticipationExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Participation record);

    int insertSelective(Participation record);

    List<Participation> selectByExample(ParticipationExample example);

    Participation selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Participation record, @Param("example") ParticipationExample example);

    int updateByExample(@Param("record") Participation record, @Param("example") ParticipationExample example);

    int updateByPrimaryKeySelective(Participation record);

    int updateByPrimaryKey(Participation record);
}
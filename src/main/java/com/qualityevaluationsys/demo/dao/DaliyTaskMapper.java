package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.DaliyTask;
import com.qualityevaluationsys.demo.domain.DaliyTaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DaliyTaskMapper {
    long countByExample(DaliyTaskExample example);

    int deleteByExample(DaliyTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DaliyTask record);

    int insertSelective(DaliyTask record);

    List<DaliyTask> selectByExample(DaliyTaskExample example);

    DaliyTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DaliyTask record, @Param("example") DaliyTaskExample example);

    int updateByExample(@Param("record") DaliyTask record, @Param("example") DaliyTaskExample example);

    int updateByPrimaryKeySelective(DaliyTask record);

    int updateByPrimaryKey(DaliyTask record);
}
package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.Later;
import com.qualityevaluationsys.demo.domain.LaterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LaterMapper {
    long countByExample(LaterExample example);

    int deleteByExample(LaterExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Later record);

    int insertSelective(Later record);

    List<Later> selectByExample(LaterExample example);

    Later selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Later record, @Param("example") LaterExample example);

    int updateByExample(@Param("record") Later record, @Param("example") LaterExample example);

    int updateByPrimaryKeySelective(Later record);

    int updateByPrimaryKey(Later record);
}
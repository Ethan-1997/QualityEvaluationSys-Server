package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.TT;
import com.qualityevaluationsys.demo.domain.TTExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TTMapper {
    long countByExample(TTExample example);

    int deleteByExample(TTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TT record);

    int insertSelective(TT record);

    List<TT> selectByExample(TTExample example);

    TT selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TT record, @Param("example") TTExample example);

    int updateByExample(@Param("record") TT record, @Param("example") TTExample example);

    int updateByPrimaryKeySelective(TT record);

    int updateByPrimaryKey(TT record);
}
package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.OtherImportant;
import com.qualityevaluationsys.demo.domain.OtherImportantExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OtherImportantMapper {
    long countByExample(OtherImportantExample example);

    int deleteByExample(OtherImportantExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(OtherImportant record);

    int insertSelective(OtherImportant record);

    List<OtherImportant> selectByExample(OtherImportantExample example);

    OtherImportant selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") OtherImportant record, @Param("example") OtherImportantExample example);

    int updateByExample(@Param("record") OtherImportant record, @Param("example") OtherImportantExample example);

    int updateByPrimaryKeySelective(OtherImportant record);

    int updateByPrimaryKey(OtherImportant record);
}
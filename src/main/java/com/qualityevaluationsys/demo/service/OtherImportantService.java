package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.domain.OtherImportant;
import com.qualityevaluationsys.demo.domain.OtherImportantExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OtherImportantService {


    int deleteByPrimaryKey(Integer oid);


    int insertSelective(OtherImportant record);


    OtherImportant selectByPrimaryKey(Integer oid);



    int updateByPrimaryKeySelective(OtherImportant record);

    PageBean getPageBean(Integer limit, String sort, Integer page, OtherImportant otherImportant);}

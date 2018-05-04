package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.OtherImportant;
import com.qualityevaluationsys.demo.domain.TT;
import com.qualityevaluationsys.demo.domain.TTExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTService {


    int deleteByPrimaryKey(Integer id);


    int insertSelective(TT record);


    TT selectByPrimaryKey(Integer id);

    PageBean getPageBean(Integer limit, String sort, Integer page, TT tt);

    int updateByPrimaryKeySelective(TT record);

    List<TT> selectByExample(TT pojo);
}

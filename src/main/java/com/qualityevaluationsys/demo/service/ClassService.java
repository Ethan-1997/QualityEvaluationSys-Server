package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.domain.Student;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassService {


    int deleteByPrimaryKey(Integer cid);


    int insertSelective(Class record);

    PageBean getPageBean(Integer limit, String sort, Integer page, Class myClass);

    Class selectByPrimaryKey(Integer cid);


    int updateByPrimaryKeySelective(Class record);

}

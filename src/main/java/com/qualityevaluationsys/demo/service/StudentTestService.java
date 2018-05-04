package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Later;
import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.domain.StudentTestExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentTestService {

    int deleteByPrimaryKey(Integer id);


    int insertSelective(StudentTest record);


    StudentTest selectByPrimaryKey(Integer id);

    PageBean getPageBean(Integer limit, String sort, Integer page, StudentTest studentTest);


    int updateByPrimaryKeySelective(StudentTest record);

    void switchDisplay(Integer cid, String tid,int status);

    List<StudentTest> listByExample(StudentTest pojo);
}

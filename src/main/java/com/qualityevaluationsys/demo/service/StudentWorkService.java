package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.StudentWork;
import com.qualityevaluationsys.demo.domain.WorkInfoAndStudentInfo;
import com.qualityevaluationsys.demo.utils.PageBean;

import java.util.List;
import java.util.Map;


public interface StudentWorkService {


    int deleteByPrimaryKey(Integer id);


    int insertSelective(StudentWork record);


    StudentWork selectByPrimaryKey(Integer id);

    PageBean getPageBean(Integer limit, String sort, Integer page, StudentWork studentWork);

    int updateByPrimaryKeySelective(StudentWork record);

    Map<String,Object> getStatisticsByWid(Integer wid) throws Exception;

    List<WorkInfoAndStudentInfo> selectStudentInfoAndWorkInfoBySid(Integer sid);

}

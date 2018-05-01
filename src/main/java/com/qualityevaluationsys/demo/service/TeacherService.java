package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Teacher;
import com.qualityevaluationsys.demo.utils.PageBean;


public interface TeacherService {


    int deleteByPrimaryKey(Integer tno);


    int insertSelective(Teacher record);

    PageBean getPageBean(Integer limit, String sort, Integer page, Teacher teacher);

    Teacher selectByPrimaryKey(Integer tno);



    int updateByPrimaryKeySelective(Teacher record);
}

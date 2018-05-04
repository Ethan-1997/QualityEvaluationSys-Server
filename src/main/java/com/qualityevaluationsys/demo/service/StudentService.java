package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.Announcement;
import com.qualityevaluationsys.demo.domain.Student;
import com.qualityevaluationsys.demo.domain.StudentExample;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    int deleteByPrimaryKey(String sid);

    int insert(Student record);

    PageBean getPageBean(Integer limit, String sort, Integer page, Student student);

    Student selectByPrimaryKey(String sid);

    List selectByCid(Integer cid);

    int updateByPrimaryKey(Student record);

    List selectall();
}

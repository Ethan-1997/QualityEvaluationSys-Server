package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.StudentTest;
public interface StudentTestService {
    int deleteByTid(String tid);

    int insert(StudentTest record);

    StudentTest selectBySid(String sid);

    int updateByTid(StudentTest record);
}

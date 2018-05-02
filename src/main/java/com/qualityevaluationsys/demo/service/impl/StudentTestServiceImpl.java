package com.qualityevaluationsys.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.dao.StudentTestMapper;
import com.qualityevaluationsys.demo.service.StudentTestService;
@Service
public class StudentTestServiceImpl implements StudentTestService {
    @Autowired
    private StudentTestMapper studentTestMapper;

    @Override
    public int deleteByTid(String tid) { return studentTestMapper.deleteByTid(tid);}

    @Override
    public int insert(StudentTest record) {return studentTestMapper.insert(record);}

    @Override
    public StudentTest selectBySid(String sid) {return studentTestMapper.selectBySid(sid);}

    @Override
    public int updateByTid(StudentTest record) {return studentTestMapper.updateBySTid(record);}
}

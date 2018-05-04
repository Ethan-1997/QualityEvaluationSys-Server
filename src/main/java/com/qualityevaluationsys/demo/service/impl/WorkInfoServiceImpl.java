package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.StudentMapper;
import com.qualityevaluationsys.demo.dao.StudentWorkMapper;
import com.qualityevaluationsys.demo.dao.SysuserMapper;
import com.qualityevaluationsys.demo.dao.WorkInfoMapper;
import com.qualityevaluationsys.demo.domain.*;
import com.qualityevaluationsys.demo.service.WorkInfoService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkInfoServiceImpl implements WorkInfoService {
    @Autowired
    private WorkInfoMapper workInfoMapper;
    @Autowired
    private SysuserMapper sysuserMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentWorkMapper studentWorkMapper;

    @Override
    public int deleteByPrimaryKey(Integer wid) {
        return workInfoMapper.deleteByPrimaryKey(wid);
    }

    @Override
    public int insertSelective(WorkInfo record) throws Exception {
        int i = workInfoMapper.insertSelective(record);
        int wid = sysuserMapper.lastInsertId();
        StudentExample example=new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(record.getCid());
        for (Student student : studentMapper.selectByExample(example)) {
            String sid = student.getSid();
            StudentWork studentWork=new StudentWork();
            studentWork.setSid(sid);
            studentWork.setWid(wid);
            studentWork.setUptime("0000-00-00 00:00:00");
            studentWork.setSubmitstatus("未提交");
            studentWorkMapper.insertSelective(studentWork);
        }
        return i;
    }

    @Override
    public WorkInfo selectByPrimaryKey(Integer wid) {
        return workInfoMapper.selectByPrimaryKey(wid);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, WorkInfo workInfo) {
        WorkInfoExample example=new WorkInfoExample();
        if(workInfo!=null){
            WorkInfoExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(workInfo.getTitle())){
                criteria.andTitleLike("%"+workInfo.getTitle()+"%");
            }
            if(!StringUtils.isNullOrEmpty(workInfo.getAuthor())){
                criteria.andAuthorLike("%"+workInfo.getAuthor()+"%");
            }
            if(workInfo.getCid()!=null){
                criteria.andCidEqualTo(workInfo.getCid());
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("endtime desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("endtime asc");
        }

        int count = (int) workInfoMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(workInfoMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(WorkInfo record) {
        return workInfoMapper.updateByPrimaryKeySelective(record);
    }
}

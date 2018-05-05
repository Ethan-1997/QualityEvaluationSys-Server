package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.ClassMapper;
import com.qualityevaluationsys.demo.dao.StudentMapper;
import com.qualityevaluationsys.demo.dao.StudentWorkMapper;
import com.qualityevaluationsys.demo.dao.WorkInfoMapper;
import com.qualityevaluationsys.demo.domain.*;
import com.qualityevaluationsys.demo.service.StudentWorkService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentWorkServiceImpl implements StudentWorkService {

    @Autowired
    private StudentWorkMapper studentWorkMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private WorkInfoMapper workInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentWorkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(StudentWork record) {
        return studentWorkMapper.insertSelective(record);
    }

    @Override
    public double averageOfWork(String sid) {
        List<AverageGrade> averageGrades = studentWorkMapper.averageOfWork(sid);
        return averageGrades.get(0).getGrade();
    }

    @Override
    public StudentWork selectByPrimaryKey(Integer id) {
        return studentWorkMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, StudentWork studentWork) {
        StudentWorkExample example=new StudentWorkExample();
        if(studentWork!=null){
            StudentWorkExample.Criteria criteria = example.createCriteria();
//            if(!StringUtils.isNullOrEmpty(studentWork.getGrade())){
//                criteria.andSidLike("%"+otherImportant.getSid()+"%");
//            }
        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("oid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("oid asc");
        }

        int count = (int) studentWorkMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(studentWorkMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(StudentWork record) {
        return studentWorkMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Map<String, Object> getStatisticsByWid(Integer wid) throws Exception {

        //去workinfo找classid
        Map<String, Object> msg=new HashMap<>(0);
        WorkInfoExample example=new WorkInfoExample();
        WorkInfoExample.Criteria criteria = example.createCriteria();
        criteria.andWidEqualTo(wid);
        List<WorkInfo> workInfos = workInfoMapper.selectByExample(example);
        if(workInfos.size()==0){
            throw new Exception("wid无效");
        }
        StudentExample example1=new StudentExample();
        StudentExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andCidEqualTo(workInfos.get(0).getCid());

        long l = studentMapper.countByExample(example1);
        msg.put("total",l);

        StudentWorkExample example2=new StudentWorkExample();
        StudentWorkExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andWidEqualTo(wid);
        criteria2.andSubmitstatusEqualTo("已提交");
        long l1 = studentWorkMapper.countByExample(example2);
        msg.put("complete",l1);
        return msg;
    }

    @Override
    public PageBean selectStudentInfoAndWorkInfoBySid(String sid,
                                                                          String title,
                                                                          String cname,
                                                                          String submit,
                                                                          String sort,
                                                                          Integer page,
                                                                          Integer limit) {
        Integer count = studentWorkMapper.CountStudentInfoAndWorkInfoBySid(sid, title, cname, submit);
        PageBean pageBean=new PageBean(page,count,limit);
        pageBean.setList(studentWorkMapper.selectStudentInfoAndWorkInfoBySid(sid,title,cname,submit,sort,pageBean.getStart(),limit)); ;
        return pageBean;
    }
}

package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.LeaveMapper;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.domain.Leave;
import com.qualityevaluationsys.demo.domain.LeaveExample;
import com.qualityevaluationsys.demo.service.LeaveService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveMapper leaveMapper;

    @Override
    public int deleteByPrimaryKey(Integer lid) {
        return leaveMapper.deleteByPrimaryKey(lid);
    }

    @Override
    public int insertSelective(Leave record) {
        return leaveMapper.insertSelective(record);
    }

    @Override
    public List<Leave> selectByExample(Leave leave) {
        LeaveExample example=new LeaveExample();
        LeaveExample.Criteria criteria = example.createCriteria();
        if(leave!=null){
            criteria.andSidEqualTo(leave.getSid());
        }
        return null;
    }

    @Override
    public Leave selectByPrimaryKey(Integer lid) {
        return leaveMapper.selectByPrimaryKey(lid);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Leave leave) {
        LeaveExample example=new LeaveExample();
        if(leave!=null){
            LeaveExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(leave.getSname())){
                criteria.andSnameLike("%"+leave.getSname()+"%");
            }
            if(!StringUtils.isNullOrEmpty(leave.getSclass())){
                criteria.andSclassLike("%"+leave.getSclass()+"%");
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("lid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("lid asc");
        }

        int count = (int) leaveMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(leaveMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(Leave record) {
        return leaveMapper.updateByPrimaryKeySelective(record);
    }
}

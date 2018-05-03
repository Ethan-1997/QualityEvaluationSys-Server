package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.ParticipationMapper;
import com.qualityevaluationsys.demo.domain.Participation;
import com.qualityevaluationsys.demo.domain.ParticipationExample;
import com.qualityevaluationsys.demo.service.ParticipationService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ParticipationServiceImpl implements ParticipationService {
    @Autowired
    private ParticipationMapper participationMapper;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return participationMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int countByStatusAndSid(String status, String sid) throws Exception {
        ParticipationExample example=new ParticipationExample();
        ParticipationExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNullOrEmpty(status)){
            throw new Exception("状态不能为空");
        }
        if(StringUtils.isNullOrEmpty(sid)){
            throw new Exception("sid不能为空");
        }
        return (int) participationMapper.countByExample(example);
    }

    @Override
    public int insertSelective(Participation record) {
        return participationMapper.insertSelective(record);
    }

    @Override
    public List<Participation> selectByExample(Participation participation, String sort) {
        ParticipationExample example=new ParticipationExample();
        ParticipationExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isNullOrEmpty(sort)){
            if(sort.equals("-id")){
                example.setOrderByClause("pid desc");
            }else{
                example.setOrderByClause("pid asc");
            }
        }
        if(participation!=null){
            criteria.andSidEqualTo(participation.getSid());
        }
        return participationMapper.selectByExample(example);
    }

    @Override
    public Participation selectByPrimaryKey(Integer pid) {
        return participationMapper.selectByPrimaryKey(pid);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Participation participation) {
        ParticipationExample example=new ParticipationExample();
        if(participation!=null){
            ParticipationExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(participation.getSid())){
                criteria.andSidEqualTo(participation.getSid());
            }
            if(!StringUtils.isNullOrEmpty(participation.getSclass())){
                criteria.andSclassLike("%"+participation.getSclass()+"%");
            }
            if(!StringUtils.isNullOrEmpty(participation.getDate())){
                criteria.andDateEqualTo(participation.getDate());
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("pid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("pid asc");
        }

        int count = (int) participationMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(participationMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(Participation record) {
        return participationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Boolean checkSignIn(String date, String sid) {
        ParticipationExample example=new ParticipationExample();
        ParticipationExample.Criteria criteria = example.createCriteria();
        criteria.andDateEqualTo(date);
        criteria.andSidEqualTo(sid);
        return participationMapper.countByExample(example)!=0;
    }
}

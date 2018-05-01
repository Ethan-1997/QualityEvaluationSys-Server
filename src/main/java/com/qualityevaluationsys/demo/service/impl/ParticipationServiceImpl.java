package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.ParticipationMapper;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.domain.Participation;
import com.qualityevaluationsys.demo.domain.ParticipationExample;
import com.qualityevaluationsys.demo.service.ParticipationService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipationServiceImpl implements ParticipationService {
    @Autowired
    private ParticipationMapper participationMapper;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return participationMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insertSelective(Participation record) {
        return participationMapper.insertSelective(record);
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
            if(!StringUtils.isNullOrEmpty(participation.getSname())){
                criteria.andSnameLike("%"+participation.getSname()+"%");
            }
            if(!StringUtils.isNullOrEmpty(participation.getSclass())){
                criteria.andSclassLike("%"+participation.getSclass()+"%");
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("cid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("cid asc");
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
}
package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.BreakRuleMapper;
import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.domain.BreakRuleExample;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.service.BreakRuleService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreakRuleServiceImpl implements BreakRuleService {
    @Autowired
    private BreakRuleMapper breakRuleMapper;
    @Override
    public int deleteByPrimaryKey(Integer bid) {
        return breakRuleMapper.deleteByPrimaryKey(bid);
    }

    @Override
    public int insertSelective(BreakRule record) {
        return breakRuleMapper.insertSelective(record);
    }

    @Override
    public BreakRule selectByPrimaryKey(Integer bid) {
        return breakRuleMapper.selectByPrimaryKey(bid);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, BreakRule breakRule) {
        BreakRuleExample example=new BreakRuleExample();
        if(breakRule!=null){
            BreakRuleExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(breakRule.getSid())){
                criteria.andSidLike("%"+breakRule.getSid()+"%");
            }
            if(!StringUtils.isNullOrEmpty(breakRule.getSclass())){
                criteria.andSclassLike("%"+breakRule.getSclass()+"%");
            }
            if(!StringUtils.isNullOrEmpty(breakRule.getTime())){
                criteria.andTimeLike("%"+breakRule.getTime()+"%");
            }
            if(!StringUtils.isNullOrEmpty(breakRule.getStatus())){
                criteria.andStatusEqualTo(breakRule.getStatus());
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("bid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("bid asc");
        }

        int count = (int) breakRuleMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(breakRuleMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(BreakRule record) {
        return breakRuleMapper.updateByPrimaryKeySelective(record);
    }
}

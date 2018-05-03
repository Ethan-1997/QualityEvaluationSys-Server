package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.TTMapper;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.domain.TT;
import com.qualityevaluationsys.demo.domain.TTExample;
import com.qualityevaluationsys.demo.service.TTService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TTServiceImpl implements TTService{
    @Autowired
    private TTMapper ttMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ttMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TT record) {
        return ttMapper.insertSelective(record);
    }

    @Override
    public TT selectByPrimaryKey(Integer id) {
        return ttMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, TT tt) {
        TTExample example=new TTExample();
        if(tt!=null){
            TTExample.Criteria criteria = example.createCriteria();
//            if(!StringUtils.isNullOrEmpty(myClass.getCname())){
//                criteria.andCnameLike("%"+myClass.getCname()+"%");
//            }
//

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("id desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("id asc");
        }

        int count = (int) ttMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(ttMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(TT record) {
        return ttMapper.updateByPrimaryKeySelective(record);
    }
}

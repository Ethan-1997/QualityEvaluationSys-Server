package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.LaterMapper;
import com.qualityevaluationsys.demo.domain.Later;
import com.qualityevaluationsys.demo.domain.LaterExample;
import com.qualityevaluationsys.demo.domain.OtherImportantExample;
import com.qualityevaluationsys.demo.service.LaterService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaterServiceImpl implements LaterService {
    @Autowired
    private LaterMapper laterMapper;

    @Override
    public int deleteByPrimaryKey(Integer lid) {
        return laterMapper.deleteByPrimaryKey(lid);
    }

    @Override
    public int insertSelective(Later record) {
        return laterMapper.insertSelective(record);
    }

    @Override
    public List<Later> selectByExample(Later leave) {
        LaterExample example=new LaterExample();
        LaterExample.Criteria criteria = example.createCriteria();
        if(leave!=null){
            criteria.andSidEqualTo(leave.getSid());
        }
        return laterMapper.selectByExample(example);
    }

    @Override
    public Later selectByPrimaryKey(Integer lid) {
        return laterMapper.selectByPrimaryKey(lid);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Later later) {
        LaterExample example=new LaterExample();
        if(later!=null){
            LaterExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(later.getSid())){
                criteria.andSidLike("%"+later.getSid()+"%");
            }
            if(!StringUtils.isNullOrEmpty(later.getSclass())){
                criteria.andSclassLike("%"+later.getSclass()+"%");
            }
            if(!StringUtils.isNullOrEmpty(later.getLtime())){
                criteria.andLtimeLike("%"+later.getLtime()+"%");
            }
        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("lid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("lid asc");
        }

        int count = (int) laterMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(laterMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int updateByPrimaryKeySelective(Later record) {
        return laterMapper.updateByPrimaryKeySelective(record);
    }
}

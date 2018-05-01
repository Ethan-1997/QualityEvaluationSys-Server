package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.HighLightingMapper;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.domain.HighLighting;
import com.qualityevaluationsys.demo.domain.HighLightingExample;
import com.qualityevaluationsys.demo.service.HighLightingService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HighLightingServiceImpl implements HighLightingService {
    @Autowired
    private HighLightingMapper highLightingMapper;

    @Override
    public int deleteByPrimaryKey(Integer hid) {
        return highLightingMapper.deleteByPrimaryKey(hid);
    }

    @Override
    public int insertSelective(HighLighting record) {
        return highLightingMapper.insertSelective(record);
    }

    @Override
    public HighLighting selectByPrimaryKey(Integer hid) {
        return highLightingMapper.selectByPrimaryKey(hid);
    }

    @Override
    public int updateByPrimaryKeySelective(HighLighting record) {
        return highLightingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, HighLighting highLighting) {
        HighLightingExample example=new HighLightingExample();
        if(highLighting!=null){
            HighLightingExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(highLighting.getSname())){
                criteria.andSnameLike("%"+highLighting.getSname()+"%");
            }
            if(!StringUtils.isNullOrEmpty(highLighting.getSclass())){
                criteria.andSclassLike("%"+highLighting.getSclass()+"%");
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("hid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("hid asc");
        }

        int count = (int) highLightingMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(highLightingMapper.selectByExample(example));
        return pageBean;
    }
}

package com.qualityevaluationsys.demo.service.impl;

import com.qualityevaluationsys.demo.dao.DaliyTaskMapper;
import com.qualityevaluationsys.demo.domain.DaliyTask;
import com.qualityevaluationsys.demo.domain.DaliyTaskExample;
import com.qualityevaluationsys.demo.service.DaliyTaskService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DaliyTaskServiceImpl implements DaliyTaskService {
    @Autowired
    DaliyTaskMapper daliyTaskMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return daliyTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DaliyTask record) {
        return daliyTaskMapper.insert(record);
    }

    @Override
    public DaliyTask selectByPrimaryKey(Integer id) {
        return daliyTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(DaliyTask record) {
        return daliyTaskMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, DaliyTask daliyTask) {
        DaliyTaskExample example=new DaliyTaskExample();
        if(daliyTask!=null){

        }
        example.setOrderByClause("atime desc");
        int count = (int) daliyTaskMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(daliyTaskMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int deleteBathById(List<Integer> ids) {
        return 0;
    }
}

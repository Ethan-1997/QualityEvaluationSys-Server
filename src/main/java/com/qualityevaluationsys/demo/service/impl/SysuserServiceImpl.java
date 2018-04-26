package com.qualityevaluationsys.demo.service.impl;

import com.qualityevaluationsys.demo.dao.SysuserMapper;
import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.domain.SysuserExample;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysuserServiceImpl implements SysuserService {
    @Autowired
    private SysuserMapper sysuserMapper;


    @Override
    public int deleteByPrimaryKey(Integer uno) {
        return  sysuserMapper.deleteByPrimaryKey(uno);
    }

    @Override
    public int insert(Sysuser record) {
        return sysuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Sysuser record) {
        return sysuserMapper.insertSelective(record);
    }

    @Override
    public Sysuser selectByPrimaryKey(Integer uno) {
        return sysuserMapper.selectByPrimaryKey(uno);
    }

    @Override
    public int updateByPrimaryKeySelective(Sysuser record) {
        return sysuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sysuser record) {
        return sysuserMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageBean getPageBean(Integer page, Integer limit, String sort, Sysuser example) {
        SysuserExample sysuserExample=new SysuserExample();
        if(sort!=null){
            if(sort.equals("-id")){
                sysuserExample.setOrderByClause("uno desc");
            }else{
                sysuserExample.setOrderByClause("uno asc");
            }
        }
        SysuserExample.Criteria criteria = sysuserExample.createCriteria();
        return null;
    }


}

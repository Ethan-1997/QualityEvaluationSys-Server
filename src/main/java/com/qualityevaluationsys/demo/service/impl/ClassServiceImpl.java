package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.ClassMapper;
import com.qualityevaluationsys.demo.domain.Class;
import com.qualityevaluationsys.demo.domain.ClassExample;
import com.qualityevaluationsys.demo.domain.StudentExample;
import com.qualityevaluationsys.demo.service.ClassService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassMapper classMapper;
    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return classMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insertSelective(Class record) {
        return classMapper.insertSelective(record);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Class myClass) {
        ClassExample example=new ClassExample();
        if(myClass!=null){
            ClassExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isNullOrEmpty(myClass.getCname())){
                criteria.andCnameLike("%"+myClass.getCname()+"%");
            }
            if(!StringUtils.isNullOrEmpty(myClass.getProfession())){
                criteria.andProfessionEqualTo(myClass.getProfession());
            }
            if(!StringUtils.isNullOrEmpty(myClass.getHeadTeacher())){
                criteria.andHeadTeacherLike("%"+myClass.getHeadTeacher()+"%");
            }

        }
        if(!StringUtils.isNullOrEmpty(sort)&& sort.equals("-id")){
            example.setOrderByClause("cid desc");
        }else if(!StringUtils.isNullOrEmpty(sort)){
            example.setOrderByClause("cid asc");
        }

        int count = (int) classMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(classMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public Class selectByPrimaryKey(Integer cid) {
        return classMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Class record) {
        return classMapper.updateByPrimaryKeySelective(record);
    }
}

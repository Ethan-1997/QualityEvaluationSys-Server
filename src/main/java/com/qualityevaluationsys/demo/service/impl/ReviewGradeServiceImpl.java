package com.qualityevaluationsys.demo.service.impl;

import com.qiniu.util.StringUtils;
import com.qualityevaluationsys.demo.dao.ReviewGradeMapper;
import com.qualityevaluationsys.demo.domain.ReviewGrade;
import com.qualityevaluationsys.demo.domain.ReviewGradeExample;
import com.qualityevaluationsys.demo.service.ReviewGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewGradeServiceImpl implements ReviewGradeService {

    @Autowired
    private ReviewGradeMapper reviewGradeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return reviewGradeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ReviewGrade record) {
        return reviewGradeMapper.insertSelective(record);
    }

    @Override
    public List<ReviewGrade> selectByExample(ReviewGrade record) {
        ReviewGradeExample reviewGradeExample = new ReviewGradeExample();
        ReviewGradeExample.Criteria criteria = reviewGradeExample.createCriteria();
        if(record!=null){
            if(!StringUtils.isNullOrEmpty(record.getType())){
                criteria.andTypeEqualTo(record.getType());
            }
            if(record.getUno()!=null){
                criteria.andUnoEqualTo(record.getUno());
            }
            if(!StringUtils.isNullOrEmpty(record.getSid())){
                criteria.andSidLike(record.getSid());
            }
        }
        return reviewGradeMapper.selectByExample(reviewGradeExample);
    }

    @Override
    public ReviewGrade selectByPrimaryKey(Integer id) {
        return reviewGradeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ReviewGrade record) {
        return reviewGradeMapper.updateByPrimaryKeySelective(record);
    }
}

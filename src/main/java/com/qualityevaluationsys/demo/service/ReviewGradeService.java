package com.qualityevaluationsys.demo.service;

import com.qualityevaluationsys.demo.domain.ReviewGrade;
import com.qualityevaluationsys.demo.domain.ReviewGradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReviewGradeService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ReviewGrade record);

    List<ReviewGrade> selectByExample(ReviewGrade record);

    ReviewGrade selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ReviewGrade record);

}

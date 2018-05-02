package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.ReviewGrade;
import com.qualityevaluationsys.demo.domain.ReviewGradeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
@Mapper
@Repository
public interface ReviewGradeMapper {
    long countByExample(ReviewGradeExample example);

    int deleteByExample(ReviewGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReviewGrade record);

    int insertSelective(ReviewGrade record);

    List<ReviewGrade> selectByExample(ReviewGradeExample example);

    ReviewGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReviewGrade record, @Param("example") ReviewGradeExample example);

    int updateByExample(@Param("record") ReviewGrade record, @Param("example") ReviewGradeExample example);

    int updateByPrimaryKeySelective(ReviewGrade record);

    int updateByPrimaryKey(ReviewGrade record);
}
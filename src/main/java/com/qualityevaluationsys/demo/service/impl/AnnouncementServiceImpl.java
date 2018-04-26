package com.qualityevaluationsys.demo.service.impl;

import com.qualityevaluationsys.demo.dao.AnnouncementMapper;
import com.qualityevaluationsys.demo.domain.Announcement;
import com.qualityevaluationsys.demo.domain.AnnouncementExample;
import com.qualityevaluationsys.demo.service.AnnouncementService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    @Override
    public int deleteByPrimaryKey(Integer ano) {
        return announcementMapper.deleteByPrimaryKey(ano);
    }

    @Override
    public int insert(Announcement record) {
        return announcementMapper.insert(record);
    }

    @Override
    public Announcement selectByPrimaryKey(Integer ano) {
        return announcementMapper.selectByPrimaryKey(ano);
    }

    @Override
    public int updateByPrimaryKey(Announcement record) {
        return announcementMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageBean getPageBean(Integer limit, String sort, Integer page, Announcement announcement) {
        AnnouncementExample example=new AnnouncementExample();
        if(announcement!=null){
            AnnouncementExample.Criteria criteria = example.createCriteria();
            if(announcement.getAcontent()!=null){
                criteria.andAcontentEqualTo(announcement.getAcontent());
            }
            if(announcement.getAno()!=null){
                criteria.andAnoEqualTo(announcement.getAno());
            }
            if(announcement.getAtime()!=null){
                criteria.andAtimeEqualTo(announcement.getAtime());
            }
            if(announcement.getAtitle()!=null){
                criteria.andAtitleEqualTo(announcement.getAtitle());
            }
        }
        example.setOrderByClause("atime desc");
        int count = (int) announcementMapper.countByExample(example);
        PageBean pageBean=new PageBean(page,count,limit);
        example.setLimit(limit);
        example.setOffset(pageBean.getStart());
        pageBean.setList(announcementMapper.selectByExample(example));
        return pageBean;
    }

    @Override
    public int deleteBathById(List<Integer> ids) {
        AnnouncementExample example=new AnnouncementExample();
        example.createCriteria().andAnoIn(ids);
        return announcementMapper.deleteByExample(example);
    }
}

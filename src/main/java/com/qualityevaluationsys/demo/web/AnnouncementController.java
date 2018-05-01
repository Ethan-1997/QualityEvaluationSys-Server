package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.Announcement;
import com.qualityevaluationsys.demo.service.AnnouncementService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "announcement")
public class AnnouncementController extends BaseController {
    @Autowired
    AnnouncementService announcementService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list( Integer limit, String sort, Integer page,@ModelAttribute Announcement announcement){
        msg.clear();
        try {
            PageBean pageBean= announcementService.getPageBean(limit,sort,page,announcement);
            msg.put("total",pageBean.getTotalCount());
            msg.put("items",pageBean.getList());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute Announcement announcement){
        msg.clear();
        try {
            int i = announcementService.insert(announcement);
            if(i==1){
                msg.put("data","success");
            }else{
                msg.put("data","create failed");
            }
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Map<String,Object> delete(@ModelAttribute Announcement announcement){
        msg.clear();
        try {
            int i = announcementService.deleteByPrimaryKey(announcement.getAno());
            if(i==1){
                msg.put("data","success");
            }else{
                msg.put("data","delete failed");
            }
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Map<String,Object> get(@ModelAttribute Announcement announcement){
        msg.clear();
        try {
            Announcement temp = announcementService.selectByPrimaryKey(announcement.getAno());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute Announcement announcement){
        msg.clear();
        try {
            int i = announcementService.updateByPrimaryKey(announcement);
            if(i==1){
                msg.put("data","success");
            }else{
                msg.put("data","update failed");
            }
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/deleteBathById",method = RequestMethod.POST)
    public Map<String,Object> deleteBathById(List<Integer> ids){
        msg.clear();
        try {
            int i = announcementService.deleteBathById(ids);
            if(i==1){
                msg.put("data","success");
            }else{
                msg.put("data","update failed");
            }
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }


}

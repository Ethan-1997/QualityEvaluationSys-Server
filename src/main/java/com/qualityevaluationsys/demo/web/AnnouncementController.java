package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.Announcement;
import com.qualityevaluationsys.demo.service.AnnouncementService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AnnouncementController extends BaseController {
    @Autowired
    AnnouncementService announcementService;

    @RequestMapping(value = "/announcement/list",method = RequestMethod.GET)
    public Map<String,Object> list( Integer limit, String sort, Integer page,@ModelAttribute Announcement announcement){
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
    @RequestMapping(value = "/announcement/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute Announcement announcement){
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
    @RequestMapping(value = "/announcement/delete",method = RequestMethod.POST)
    public Map<String,Object> delete(@ModelAttribute Announcement announcement){
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

    @RequestMapping(value = "/announcement/get",method = RequestMethod.GET)
    public Map<String,Object> get(@ModelAttribute Announcement announcement){
        try {
            Announcement temp = announcementService.selectByPrimaryKey(announcement.getAno());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/announcement/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute Announcement announcement){
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
    @RequestMapping(value = "/announcement/deleteBathById",method = RequestMethod.POST)
    public Map<String,Object> deleteBathById(List<Integer> ids){
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

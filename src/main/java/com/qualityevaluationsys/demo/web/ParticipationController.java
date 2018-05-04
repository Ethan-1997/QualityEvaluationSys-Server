package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.domain.OtherImportant;
import com.qualityevaluationsys.demo.domain.Participation;
import com.qualityevaluationsys.demo.service.ParticipationService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "participation")
public class ParticipationController  extends BaseController{
    @Autowired
    ParticipationService service;


    @RequestMapping(value = "/checkSignIn",method = RequestMethod.GET)
    public Map<String,Object> checkSignIn(String date,String sid){
        msg.clear();
        try {
            Boolean flag=service.checkSignIn(date,sid);
            msg.put("flag",flag);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/listBySid",method = RequestMethod.GET)
    public Map<String,Object> listBySid(String sort, @ModelAttribute Participation pojo){
        msg.clear();
        try {
            List<Participation> participations = service.selectByExample(pojo,sort);
            msg.put("items",participations);
            msg.put("count",participations.size());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/countByStatusAndSid",method = RequestMethod.GET)
    public Map<String,Object> countByStatusAndSid( @ModelAttribute Participation pojo){
        msg.clear();
        try {
            int i = service.countByStatusAndSid(pojo.getStatus(), pojo.getSid());
            msg.put("count",i);
            msg.put("data","success");
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute Participation pojo){
        msg.clear();
        try {
            PageBean pageBean= service.getPageBean(limit,sort,page,pojo);
            msg.put("total",pageBean.getTotalCount());
            msg.put("items",pageBean.getList());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute Participation pojo){
        msg.clear();
        try {
            int i = service.insertSelective(pojo);
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
    public Map<String,Object> delete(@ModelAttribute Participation pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getPid());
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
    public Map<String,Object> get(@ModelAttribute Participation pojo){
        msg.clear();
        try {
            Participation temp = service.selectByPrimaryKey(pojo.getPid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute Participation pojo){
        msg.clear();
        try {
            int i = service.updateByPrimaryKeySelective(pojo);
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

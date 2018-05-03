package com.qualityevaluationsys.demo.web;


import com.qualityevaluationsys.demo.domain.Later;
import com.qualityevaluationsys.demo.service.LaterService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "later")
public class LaterController  extends BaseController{
    @Autowired
    LaterService service;


    @RequestMapping(value = "/listBySid",method = RequestMethod.GET)
    public Map<String,Object> listBySid( @ModelAttribute Later pojo){
        msg.clear();
        try {
            List<Later> leaves = service.selectByExample(pojo);
            msg.put("items",leaves);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute Later pojo){
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
    public Map<String,Object> create(@ModelAttribute Later pojo){
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
    public Map<String,Object> delete(@ModelAttribute Later pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getLid());
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
    public Map<String,Object> get(@ModelAttribute Later pojo){
        msg.clear();
        try {
            Later temp = service.selectByPrimaryKey(pojo.getLid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute Later pojo){
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

package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.domain.HighLighting;
import com.qualityevaluationsys.demo.service.HighLightingService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "highlighting")
public class HighLightingController  extends BaseController{
    @Autowired
    HighLightingService service;


    @RequestMapping(value = "/listBySid",method = RequestMethod.GET)
    public Map<String,Object> listBySid( @ModelAttribute HighLighting pojo){
        msg.clear();
        try {
            List<HighLighting> highLightings = service.selectByExample(pojo);
            msg.put("items",highLightings);
            msg.put("count",highLightings.size());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute HighLighting pojo){
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
    public Map<String,Object> create(@ModelAttribute HighLighting pojo){
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
    public Map<String,Object> delete(@ModelAttribute HighLighting pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getHid());
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
    public Map<String,Object> get(@ModelAttribute HighLighting pojo){
        msg.clear();
        try {
            HighLighting temp = service.selectByPrimaryKey(pojo.getHid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute HighLighting pojo){
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

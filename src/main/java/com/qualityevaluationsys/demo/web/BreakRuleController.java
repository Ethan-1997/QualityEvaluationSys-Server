package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.BreakRule;
import com.qualityevaluationsys.demo.service.BreakRuleService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "breakrule")
public class BreakRuleController extends BaseController {
    @Autowired
    BreakRuleService service;


    @RequestMapping(value = "/listBySid",method = RequestMethod.GET)
    public Map<String,Object> listBySid( @ModelAttribute BreakRule pojo){
        msg.clear();
        try {
            List<BreakRule> breakRules = service.selectByExample(pojo);
            msg.put("items",breakRules);
            msg.put("count",breakRules.size());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/countByStatusAndSid",method = RequestMethod.GET)
    public Map<String,Object> countByStatusAndSid( @ModelAttribute BreakRule pojo){
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
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute BreakRule pojo){
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
    public Map<String,Object> create(@ModelAttribute BreakRule pojo){
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
    public Map<String,Object> delete(@ModelAttribute BreakRule pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getBid());
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
    public Map<String,Object> get(@ModelAttribute BreakRule pojo){
        msg.clear();
        try {
            BreakRule temp = service.selectByPrimaryKey(pojo.getBid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute BreakRule pojo){
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

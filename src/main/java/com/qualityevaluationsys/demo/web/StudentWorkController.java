package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.StudentWork;
import com.qualityevaluationsys.demo.domain.WorkInfo;
import com.qualityevaluationsys.demo.service.StudentWorkService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "studentwork")
public class StudentWorkController extends BaseController {
    @Autowired
    private StudentWorkService sysuserService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute StudentWork user){
        msg.clear();
        try {
            PageBean pageBean= sysuserService.getPageBean(limit,sort,page,user);
            msg.put("total",pageBean.getTotalCount());
            msg.put("items",pageBean.getList());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute StudentWork user){
        msg.clear();
        try {
            int i = sysuserService.insertSelective(user);
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
    public Map<String,Object> delete(@ModelAttribute StudentWork user){
        msg.clear();
        try {
            int i = sysuserService.deleteByPrimaryKey(user.getId());
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
    public Map<String,Object> get(@ModelAttribute StudentWork user){
        msg.clear();
        try {
            StudentWork temp = sysuserService.selectByPrimaryKey(user.getId());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute StudentWork user){
        msg.clear();
        try {
            int i = sysuserService.updateByPrimaryKeySelective(user);
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

    @RequestMapping(value = "/getStatisticsByWid",method = RequestMethod.POST)
    public Map<String,Object> getStatisticsByWid(@ModelAttribute WorkInfo user){
        msg.clear();
        try {
           msg= sysuserService.getStatisticsByWid(user.getWid());
           msg.put("data","success");
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
}

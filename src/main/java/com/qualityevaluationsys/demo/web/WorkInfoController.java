package com.qualityevaluationsys.demo.web;

import com.qiniu.util.Auth;
import com.qualityevaluationsys.demo.domain.WorkInfo;
import com.qualityevaluationsys.demo.service.WorkInfoService;
import com.qualityevaluationsys.demo.utils.LocalConfig;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "workinfo")
public class WorkInfoController  extends BaseController{
    @Autowired
    private WorkInfoService workInfoService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute WorkInfo user){
        msg.clear();
        try {
            PageBean pageBean= workInfoService.getPageBean(limit,sort,page,user);
            msg.put("total",pageBean.getTotalCount());
            msg.put("items",pageBean.getList());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute WorkInfo workInfo){
        msg.clear();
        try {
            int i = workInfoService.insertSelective(workInfo);
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
    public Map<String,Object> delete(@ModelAttribute WorkInfo user){
        msg.clear();
        try {
            int i = workInfoService.deleteByPrimaryKey(user.getWid());
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
    public Map<String,Object> get(@ModelAttribute WorkInfo user){
        msg.clear();
        try {
            WorkInfo temp = workInfoService.selectByPrimaryKey(user.getWid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute WorkInfo user){
        msg.clear();
        try {
            int i = workInfoService.updateByPrimaryKeySelective(user);
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

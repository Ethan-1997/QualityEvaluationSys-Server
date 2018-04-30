package com.qualityevaluationsys.demo.web;

import com.qiniu.util.Auth;
import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="user")
public class SysUserController extends BaseController {
    @Autowired
    private SysuserService sysuserService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute Sysuser user){
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
    public Map<String,Object> create(@ModelAttribute Sysuser user){
        try {
            int i = sysuserService.insert(user);
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
    public Map<String,Object> delete(@ModelAttribute Sysuser user){
        try {
            int i = sysuserService.deleteByPrimaryKey(user.getUno());
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
    public Map<String,Object> get(@ModelAttribute Sysuser user){
        try {
            Sysuser temp = sysuserService.selectByPrimaryKey(user.getUno());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute Sysuser user){
        try {
            int i = sysuserService.updateByPrimaryKey(user);
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
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> info(String token){
        try {
            Sysuser user = sysuserService.info(token);
            msg.put("user",user);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

}

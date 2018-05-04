package com.qualityevaluationsys.demo.web;

import com.qiniu.util.Auth;
import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.LocalConfig;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="user")
public class SysUserController extends BaseController {
    @Autowired
    private SysuserService sysuserService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute Sysuser user){
        msg.clear();
        try {
            PageBean pageBean= sysuserService.getPageBean(page,limit,sort,user);
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
        msg.clear();
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
        msg.clear();
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
        msg.clear();
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
        msg.clear();
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
        msg.clear();
        try {
            Sysuser user = sysuserService.info(token);
            List<String> roles=sysuserService.getRole(user);
            String accessKey = "dj8UWa4IqlmzhrKAysU4YzZPZVUQhVNf-pOnR4Ib";
            String secretKey = "CcKuXFuJNAL4gGDvWbiqfwakmYfuAalM1M28p5PV";
            String bucket = "media";
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            msg.put("id", LocalConfig.ID);
            msg.put("upToken",upToken);
            msg.put("roles",roles);
            msg.put("user",user);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/getCurrentUser",method = RequestMethod.GET)
    public Map<String,Object> getCurrentUser(HttpServletRequest request){
        msg.clear();
        msg.put("user",sysuserService.getCurrentUser(request.getHeader("X-Token")));
        return  msg;
    }
}

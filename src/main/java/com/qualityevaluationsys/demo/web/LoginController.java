package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseController {
    @Autowired
    private SysuserService sysuserService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Map<String,Object> list(@ModelAttribute Sysuser user){
        try{
            //TODO 优化效率
            String token= sysuserService.login(user);
            List<String> roles=sysuserService.getRole(user);
            msg.put("roles",roles);
            msg.put("token",token);
            msg.put("message","success");
        }catch (Exception e){
            msg.remove("roles");
            msg.remove("token");
            msg.put("message",e.getMessage());
        }


        return  msg;
    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public Map<String,Object> logout(){
        try {
            msg.put("message","success");
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
}

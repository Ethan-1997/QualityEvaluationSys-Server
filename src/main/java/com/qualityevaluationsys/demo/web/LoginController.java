package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseController {
    @Autowired
    private SysuserService sysuserService;
    @RequestMapping(value = "/login")
    public Map<String,Object> list(String password,String username){
        msg.clear();
        try{
            //TODO 优化效率
            Sysuser user=new Sysuser();
            user.setUpassword(password);
            user.setUname(username);
            String token= sysuserService.login(user);

            msg.put("token",token);
            msg.put("message","success");
        }catch (Exception e){
            msg.remove("roles");
            msg.remove("token");
            msg.put("message",e.getMessage());
        }


        return  msg;
    }
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public Map<String,Object> logout(){
        msg.clear();
        try {
            msg.put("message","success");
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
}

package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.StudentTicket;
import com.qualityevaluationsys.demo.service.StudentTicketService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequestMapping(value = "StudentTicket")
@RestController

public class StudentTicketController extends BaseController{
    @Autowired
    StudentTicketService studentTicketService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> get(@ModelAttribute StudentTicket studentTicket){
        msg.clear();
        try {
            List temp = studentTicketService.selectByCid(studentTicket.getCid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute StudentTicket studentTicket){
        msg.clear();
        try {
            int i = studentTicketService.updateBySid(studentTicket);
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

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Map<String,Object> delete(@ModelAttribute StudentTicket studentTicket){
        msg.clear();
        try {
            int i = studentTicketService.deleteBySid(studentTicket.getSid());
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

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute StudentTicket studentTicket){
        msg.clear();
        try {
            int i = studentTicketService.insert(studentTicket);
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
}

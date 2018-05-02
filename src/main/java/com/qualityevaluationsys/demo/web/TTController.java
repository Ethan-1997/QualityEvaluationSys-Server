package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.TT;
import com.qualityevaluationsys.demo.service.TTService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequestMapping(value = "TeacherTest")
@RestController

public class TTController extends BaseController{
    @Autowired
    TTService ttService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> get(@ModelAttribute TT tt){
        msg.clear();
        try {
            TT temp = ttService.selectByTno(tt.getTno());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute TT tt){
        msg.clear();
        try {
            int i = ttService.updateByTid(tt);
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
    public Map<String,Object> delete(@ModelAttribute TT tt){
        msg.clear();
        try {
            int i = ttService.deleteByTid(tt.getTid());
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
    public Map<String,Object> create(@ModelAttribute TT tt){
        msg.clear();
        try {
            int i = ttService.insert(tt);
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

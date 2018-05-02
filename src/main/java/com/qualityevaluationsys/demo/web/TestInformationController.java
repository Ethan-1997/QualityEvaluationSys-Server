package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.TestInformation;
import com.qualityevaluationsys.demo.service.TestInformationService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequestMapping(value = "test")
@RestController
public class TestInformationController extends BaseController {
    @Autowired
    TestInformationService testInformationService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> get(@ModelAttribute TestInformation testInformation){
        msg.clear();
        try {
            TestInformation temp = testInformationService.selectByPrimaryKey(testInformation.getTid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute TestInformation testInformation){
        msg.clear();
        try {
            int i = testInformationService.updateByPrimaryKey(testInformation);
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
    public Map<String,Object> delete(@ModelAttribute TestInformation testInformation){
        msg.clear();
        try {
            int i = testInformationService.deleteByPrimaryKey(testInformation.getTid());
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
    public Map<String,Object> create(@ModelAttribute TestInformation testInformation){
        msg.clear();
        try {
            int i = testInformationService.insert(testInformation);
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

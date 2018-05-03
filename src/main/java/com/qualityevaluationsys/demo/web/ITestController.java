package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.ITest;
import com.qualityevaluationsys.demo.service.ITestService;
import com.qualityevaluationsys.demo.utils.PageBean;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "itest")
public class ITestController extends BaseController {
    @Autowired
    ITestService service;

    String charReader(HttpServletRequest request) throws IOException {
        BufferedReader br = request.getReader();
        String str, wholeStr = "";
        while((str = br.readLine()) != null){
            wholeStr += str;
        }
        return wholeStr;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute ITest pojo, HttpServletRequest request, HttpServletResponse response){
        msg.clear();
        try {
            String data=charReader(request);
            JSONObject obj2= (JSONObject) JSONValue.parse(data);
            String tid = (String) obj2.get("Tid");
            String tname = (String) obj2.get("Tname");
            String ttype=(String)obj2.get("Ttype");
            String tquestion=(String)obj2.get("Tquestion");
            pojo.setTid(tid);
            pojo.setTname(tname);
            pojo.setTtype(ttype);
            pojo.setTquestion(tquestion);
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
    public Map<String,Object> delete(@ModelAttribute ITest pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getTid());
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
    public Map<String,Object> get(@ModelAttribute ITest pojo){
        msg.clear();
        try {
            ITest temp = service.selectByPrimaryKey(pojo.getTid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute ITest pojo){
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

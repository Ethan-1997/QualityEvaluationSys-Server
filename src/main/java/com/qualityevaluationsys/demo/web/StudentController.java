package com.qualityevaluationsys.demo.web;

import com.qualityevaluationsys.demo.domain.Student;
import com.qualityevaluationsys.demo.domain.StudentExample;
import com.qualityevaluationsys.demo.service.StudentService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "student")
public class StudentController  extends BaseController{
    @Autowired
    StudentService service;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute Student pojo){
        msg.clear();
        try {
            PageBean pageBean= service.getPageBean(limit,sort,page,pojo);
            msg.put("total",pageBean.getTotalCount());
            msg.put("items",pageBean.getList());
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Map<String,Object> create(@ModelAttribute Student pojo){
        msg.clear();
        try {
            int i = service.insert(pojo);
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
    public Map<String,Object> delete(@ModelAttribute Student pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getSid());
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
    public Map<String,Object> get(@ModelAttribute Student pojo){
        msg.clear();
        try {
            Student temp = service.selectByPrimaryKey(pojo.getSid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute Student pojo){
        msg.clear();
        try {
            int i = service.updateByPrimaryKey(pojo);
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

    @RequestMapping(value = "/getstudent",method = RequestMethod.GET)
    public Map<String,Object> getstudent(Integer Cid){
        msg.clear();
        try {
            List temp = service.selectByCid(Cid);
            msg.put("items",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/getstudentall",method = RequestMethod.GET)
    public Map<String,Object> getstudentall(){
        msg.clear();
        try {
            List temp = service.selectall();
            msg.put("items",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
}

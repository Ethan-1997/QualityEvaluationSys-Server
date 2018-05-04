package com.qualityevaluationsys.demo.web;
import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.service.StudentTestService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.service.StudentTestService;

import java.util.List;
import java.util.Map;
@RequestMapping(value = "studenttest")
@RestController
public class StudentTestController extends BaseController{
    @Autowired
    StudentTestService service;

    @RequestMapping(value = "/switchDisplay",method = RequestMethod.GET)
    public Map<String,Object> switchDisplay(Integer cid,String tid,int status){
        msg.clear();
        try {
            service.switchDisplay(cid,tid,status);
            msg.put("data","success");
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/listByExample",method = RequestMethod.GET)
    public Map<String,Object> listByExample(@ModelAttribute StudentTest pojo){
        msg.clear();
        try {
            List<StudentTest> studentTests= service.listByExample(pojo);
            msg.put("total",studentTests.size());
            msg.put("items",studentTests);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(Integer limit, String sort, Integer page, @ModelAttribute StudentTest pojo){
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
    public Map<String,Object> create(@ModelAttribute StudentTest pojo){
        msg.clear();
        try {
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
    public Map<String,Object> delete(@ModelAttribute StudentTest pojo){
        msg.clear();
        try {
            int i = service.deleteByPrimaryKey(pojo.getId());
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
    public Map<String,Object> get(@ModelAttribute StudentTest pojo){
        msg.clear();
        try {
            StudentTest temp = service.selectByPrimaryKey(pojo.getId());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute StudentTest pojo){
        msg.clear();
        try {
            int i = service.updateByPrimaryKeySelective(pojo);
            if(i!=0){
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

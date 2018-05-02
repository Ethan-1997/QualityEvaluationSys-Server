package com.qualityevaluationsys.demo.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qualityevaluationsys.demo.domain.StudentTest;
import com.qualityevaluationsys.demo.service.StudentTestService;
import java.util.Map;
@RequestMapping(value = "StudentTest")
@RestController
public class StudentTestController extends BaseController{
    @Autowired
    StudentTestService studentTestService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> get(@ModelAttribute StudentTest studentTest){
        msg.clear();
        try {
            StudentTest temp = studentTestService.selectBySid(studentTest.getSid());
            msg.put("item",temp);
        }catch (Exception e){
            msg.put("data","error");
            msg.put("message",e.getMessage());
        }
        return  msg;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> update(@ModelAttribute StudentTest studentTest){
        msg.clear();
        try {
            int i = studentTestService.updateByTid(studentTest);
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
    public Map<String,Object> delete(@ModelAttribute StudentTest studentTest){
        msg.clear();
        try {
            int i = studentTestService.deleteByTid(studentTest.getTid());
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
    public Map<String,Object> create(@ModelAttribute StudentTest studentTest){
        msg.clear();
        try {
            int i = studentTestService.insert(studentTest);
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

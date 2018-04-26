package com.qualityevaluationsys.demo.web;

import com.qiniu.util.Auth;
import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.service.SysuserService;
import com.qualityevaluationsys.demo.utils.PageBean;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value="api/users")
public class SysUserController extends BaseController {
    @Autowired
    private SysuserService sysuserService;
    @RequestMapping(value="/", method= RequestMethod.GET)
    public PageBean getUserList(@PathVariable String sort,@PathVariable Integer page,@PathVariable Integer limit,@ModelAttribute Sysuser example) {
        //123
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<User> r = new ArrayList<User>(users.values());

        return  null;
//        return sysuserService.getPageBean(page,limit,sort,example);
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUser(@ModelAttribute Sysuser user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        sysuserService.insert(user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Sysuser getUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return sysuserService.selectByPrimaryKey(id);
    }

    @RequestMapping(value="/", method=RequestMethod.PUT)
    public String putUser(@PathVariable Integer id, @ModelAttribute Sysuser user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        sysuserService.updateByPrimaryKey(user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        sysuserService.deleteByPrimaryKey(id);
        return "success";
    }
}

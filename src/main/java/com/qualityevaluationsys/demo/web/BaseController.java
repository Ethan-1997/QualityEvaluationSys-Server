package com.qualityevaluationsys.demo.web;


import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected Map<String,Object> msg=new HashMap<>(0);

    public Map<String, Object> getMsg() {
        return msg;
    }

    public void setMsg(Map<String, Object> msg) {
        this.msg = msg;
    }
}

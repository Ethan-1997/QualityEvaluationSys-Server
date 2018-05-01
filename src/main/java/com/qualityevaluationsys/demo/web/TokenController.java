package com.qualityevaluationsys.demo.web;

import com.qiniu.util.Auth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TokenController extends BaseController {
    @RequestMapping(value="getUpToken", method= RequestMethod.GET)
    public Map<String,Object> getUpToken(){
        msg.clear();
        String accessKey = "dj8UWa4IqlmzhrKAysU4YzZPZVUQhVNf-pOnR4Ib";
        String secretKey = "CcKuXFuJNAL4gGDvWbiqfwakmYfuAalM1M28p5PV";
        String bucket = "media";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        msg.put("upToken",upToken);
        return msg;
    }
}

package com.qualityevaluationsys.demo.config;

import com.qualityevaluationsys.demo.Interceptor.AuthInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class InterceptorConfiguration  extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        InterceptorRegistration ir = registry.addInterceptor(new AuthInterceptor());
        // 配置拦截的路径
        ir.addPathPatterns("/**");
        // 配置不拦截的路径
       ir.excludePathPatterns("/login/*");

        // 还可以在这里注册其它的拦截器
        //registry.addInterceptor(new OtherInterceptor()).addPathPatterns("/**");
    }
}

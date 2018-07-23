package com.kajie88.bootexplore.configuration;


import com.kajie88.bootexplore.interceptor.ProcessInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.http.HttpServletRequest;

@Configuration
@RestControllerAdvice
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {
    //拦截器配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new ProcessInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }


}


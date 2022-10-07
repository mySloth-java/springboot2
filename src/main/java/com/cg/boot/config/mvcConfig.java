package com.cg.boot.config;

import com.cg.boot.intercepter.loginInter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class mvcConfig implements WebMvcConfigurer {

    //定制化拦截器，添加自己创建的拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new loginInter())
                .addPathPatterns("/**")//配置拦截所有资源
                .excludePathPatterns("/","/login","css/**","csspackage/**","fonts/**","images/**","js/**");//配置不拦截的资源(静态资源、登录页面)
    }
}

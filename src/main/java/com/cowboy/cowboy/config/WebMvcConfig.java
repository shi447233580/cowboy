package com.cowboy.cowboy.config;

import com.cowboy.cowboy.intecepter.LoginIntecepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPattern后跟拦截地址，excludePathPatterns后跟排除拦截地址
//        registry.addInterceptor(new LoginIntecepter()).addPathPatterns("/**").excludePathPatterns("/index");
        // 注册拦截器
//        LoginIntecepter loginInterceptor = new LoginIntecepter();
//        InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);
//        // 拦截路径
//        loginRegistry.addPathPatterns("/**");
//        // 排除路径
//        // 排除资源请求
//        loginRegistry.excludePathPatterns("/css/**");
//        loginRegistry.excludePathPatterns("/mp/**");
//        loginRegistry.excludePathPatterns("/js/**/**");
//        loginRegistry.excludePathPatterns("/images/**");
//        loginRegistry.excludePathPatterns("/fonts/**");

    }
}

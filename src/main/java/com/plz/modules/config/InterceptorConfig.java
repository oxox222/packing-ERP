package com.plz.modules.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: InterceptorConfig
 * @Description: 注册拦截器
 * @Author: PANLVZ
 * @Date: 2020-03-13
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new com.example.sale.config.LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login/**");
    }
}

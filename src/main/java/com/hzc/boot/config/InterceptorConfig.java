package com.hzc.boot.config;

import com.hzc.boot.interceptor.TestInterceptor1;
import com.hzc.boot.interceptor.TestInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hanzhichao7
 * @date 2023/4/4 10:35
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testInterceptor1())
                .addPathPatterns("/hello", "/hello1")
                .excludePathPatterns("/hello2").order(1);

        registry.addInterceptor(testInterceptor2)
                .addPathPatterns("/hello2").order(2);

    }

    // 构造器注入
    @Bean
    public TestInterceptor1 testInterceptor1(){
        return new TestInterceptor1();
    }
    // 自动注入, TestInterceptor2需要使用创建对象的注解修饰，如@Component
    @Autowired
    private TestInterceptor2 testInterceptor2;


}

package com.bjpowernode.config;

import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSystemConfig {

    //注册Servlet
    @Bean
    public ServletRegistrationBean<MyServlet> servletRegistrationBean(){
        MyServlet myServlet = new MyServlet();
        ServletRegistrationBean<MyServlet> reg = new ServletRegistrationBean<>(myServlet,"/myservlet");
        return reg;
    }

}

package com.yuc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.ServletContext;

public class WebStaticUrl  extends WebMvcConfigurationSupport {
    @Value("#{prop.webUrl}")
    private String webUrl ;
    @Autowired
    private ServletContext context;
    public void init(){
        context.setAttribute("webStaticUrl", webUrl);
        this.setServletContext(context);
    }

}

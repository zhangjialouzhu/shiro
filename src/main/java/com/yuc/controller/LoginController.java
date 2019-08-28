package com.yuc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.ServletContext;


@Controller
@RequestMapping(value = "/login")
public class LoginController extends WebMvcConfigurationSupport {
    @Autowired
    private ServletContext servletContext;
    @RequestMapping(value = "/index")
    public ModelAndView login(String username,String password){
        ModelAndView modelAndView = new ModelAndView();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            modelAndView.setViewName("redirect:/index");
        }catch (AuthenticationException e){
            modelAndView.setViewName("login/login");
        }

        /*this.setServletContext(servletContext);
        servletContext.setAttribute("login", "yes");*/
        return modelAndView;
    }
    @RequestMapping(value = "/loginout")
    public ModelAndView logout(){
       /* this.setServletContext(servletContext);
        servletContext.setAttribute("login", "");*/
       Subject subject = SecurityUtils.getSubject();
       subject.logout();
       return new ModelAndView("index" );
    }
}

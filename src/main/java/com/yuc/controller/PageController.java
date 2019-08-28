package com.yuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/errorpage")
public class PageController {
    @RequestMapping(value = "/404")
    public ModelAndView get404(){
        return new ModelAndView("errorpage/404");
    }
    @RequestMapping(value = "/405")
    public ModelAndView get405(){
        return new ModelAndView("errorpage/405");
    }
    @RequestMapping(value = "/500")
    public ModelAndView get504(){
        return new ModelAndView("errorpage/500");
    }
}

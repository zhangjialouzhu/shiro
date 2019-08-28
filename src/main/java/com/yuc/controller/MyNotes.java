package com.yuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "notes")
public class MyNotes {
    @RequestMapping(value = "list")
    public String getList(){
        return "notes/list";
    }
}

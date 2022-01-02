package com.cc.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex(){
        System.out.println("Starting Service 1236.......");
        return "index";
    }

}

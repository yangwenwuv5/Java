package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(){
        //返回视图名称
        return "index";
    }
    @RequestMapping(value = "/target")
    public String target(){
        //返回视图名称
        return "target";
    }
}

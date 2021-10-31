package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@RequestMapping(value = "/hello")
public class RequestMappingcontroller {
    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            method = { RequestMethod.POST}
    )
    public String success(){
        return "success";
    }
    @PutMapping(value = "/target")
    public String target(){
        return "target";
    }
    @RequestMapping(
            value = "/testParam",
            method = {RequestMethod.POST,RequestMethod.GET},
            params = {"username!=admin","password"}
    )
    public String Param(){
        return "target";
    }
    @RequestMapping("/testAnt/{id}")
    public String Ant(@PathVariable("id")Integer id){
        System.out.println("id:"+id);
        return "target";
    }
}

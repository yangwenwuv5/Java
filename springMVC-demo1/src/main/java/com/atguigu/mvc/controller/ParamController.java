package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


@SuppressWarnings({"ALL", "AlibabaClassMustHaveAuthor"})
@Controller
/**
 * Demo Class
 * @author KaZaKy
 * @date 2021/10/31
 */
public class ParamController {
    @RequestMapping("/testParamApi")
    public String testParam() {
        return "test_param";
    }

    @RequestMapping("/testServertApi")
    public String testServletApi(HttpServletRequest request) {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(user + password);
        return "success";
    }

    @RequestMapping("/testAPI")
    public String testApiCase(String username, String password,String[] hobby) {
        System.out.println("username:" + username +" "+"password:" + password+"\n"+"hobby:"+ Arrays.toString(hobby));
        return "success";
    }
}

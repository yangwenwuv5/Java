package com.atguigu.mvc.controller;

import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
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
    public String testApiCase(@RequestParam(value = "user_name",required = false,defaultValue = "admin") String username,
                              String password,
                              String[] hobby,
                              @RequestHeader("Host") String Host) {
        System.out.println("username:" + username + " " + "password:" + password + "\n" + "hobby:" + Arrays.toString(hobby));
        System.out.println("HOST:"+ Host);
//        System.out.println("JSESSIONID"+JSESSIONID);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testbean(User user){
        System.out.println(user);
        return "success";
    }
}

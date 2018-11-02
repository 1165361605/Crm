package com.ssm.controller;

import com.ssm.pojo.Admin;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class loginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("index/toindex")
    public String exit(HttpServletResponse response){
        Cookie username = new Cookie("username",null);
        Cookie userpassword = new Cookie("userpaaword",null);
        Cookie type = new Cookie("type",null);
        username.setMaxAge(0);
        userpassword.setMaxAge(0);
        type.setMaxAge(0);
        username.setPath("/");
        userpassword.setPath("/");
        type.setPath("/");
        response.addCookie(username);
        response.addCookie(userpassword);
        response.addCookie(type);
        return "login";
    }


    @RequestMapping("index")
    public String index(HttpServletRequest request,HttpServletResponse response){
        //！！！！很奇怪，Cookie取不了值
        //解决。。之前默认储存path为/login，而读取的路径是/
        Cookie[] cookies = request.getCookies();
        Admin admin = new Admin();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName());
                if (cookie.getName().equals("username")) {
                    admin.setUsername(cookie.getValue());
                } else if (cookie.getName().equals("userpaaword")) {
                    admin.setUserpw(cookie.getValue());
                } else if (cookie.getName().equals("type")) {
                    admin.setUsertype(Integer.valueOf(cookie.getValue()));
                }
            }
        }else {
            return "login";
        }


        String result = loginService.login(admin,response);
        return result;

    }

    @RequestMapping("login/check")
    public String login(Admin admin, Model model, HttpServletResponse response){
        String result = loginService.login(admin,response);
        if (result.equals("login"))
            model.addAttribute("iserror","登录失败！");
        return result;

    }

    @RequestMapping("selectusername")
    @ResponseBody
    public String selectUserName(String u){
        int i = loginService.countUserName(u);
        System.out.println(i);
        boolean isExist = (i > 0 ? true:false);
        //  System.out.println(u);
        return isExist+"";
    }
}

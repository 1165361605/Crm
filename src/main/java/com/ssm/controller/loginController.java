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

    @RequestMapping("index")
    public String index(HttpServletRequest request,HttpServletResponse response){
        //！！！！很奇怪，Cookie取不了值
        Cookie[] cookies = request.getCookies();
        Admin admin = new Admin();
        for (Cookie cookie : cookies){
            System.out.println(cookie.getName());
            if (cookie.getName().equals("username")){
                admin.setUsername(cookie.getValue());
            }
            else if (cookie.getName().equals("userpaaword")){
                admin.setUserpw(cookie.getValue());
            }
            else if (cookie.getName().equals("type")){
                admin.setUsertype(Integer.valueOf(cookie.getValue()));
            }else if (cookie.getName().equals("JSESSIONID")){
                //cookie的域名
            }
            else {
                return "login";
            }
        }

        String result = loginService.login(admin,response);
        return result;

    }

    @RequestMapping("login/check")
    public String login(Admin admin, Model model, HttpServletResponse response){
        String result = loginService.login(admin,response);
        Integer usertype = admin.getUsertype();
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
        System.out.println(i);
        System.out.println(isExist);
        return isExist+"";
    }
}

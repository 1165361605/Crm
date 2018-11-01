package com.ssm.controller;

import com.ssm.pojo.Admin;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("index")
    public String index(){
        return "login";
    }

    @RequestMapping("login/check")
    public String login(Admin admin, Model model){
        boolean b = loginService.login(admin);
        Integer usertype = admin.getUsertype();
        if (b)
            if (usertype==0) return "redirect:/admin" ;//重定向登陆成功界面,重定向到管理员页面
            if (usertype==1) return "redirect:/register" ;//重定向登陆成功界面,重定向到管理员页面
        else {
            model.addAttribute();
            return "login";
            }
    }
}

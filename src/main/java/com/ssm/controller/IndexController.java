package com.ssm.controller;

import com.ssm.pojo.Users;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class IndexController {
    @Autowired
    private UsersService usersService;
    /*
    * 跳转首页,  并显示所有用户信息
    * */
    @RequestMapping(value = "/index/customer")
    private String index(){
        return "customer";
    }
    @RequestMapping(value = "/customer/list")
    public String selectUsersList(Model model){
        //查询所有用户信息
        List<Users> list = usersService.selectUserList();
        model.addAttribute("list",list);
        return "customer";
    }
    @RequestMapping(value = "/customer/selectlist/{UserName}")
    private String selectUsersByNmae(@PathVariable String UserName,Model model){
        List<Users> list = usersService.selectUserByUserName(UserName);
        model.addAttribute("items",list);
        return "customer";
    }
}

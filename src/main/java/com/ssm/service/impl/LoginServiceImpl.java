package com.ssm.service.impl;

import com.ssm.mapper.AdminMapper;
import com.ssm.pojo.Admin;
import com.ssm.pojo.AdminExample;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private HttpServletRequest request;

    @Override
    public String login(Admin admin,HttpServletResponse response) {
        Admin list = adminMapper.selectLogin(admin);
        //System.out.println(list.getUsertype());
        if (list != null) {
            Cookie username = new Cookie("username",admin.getUsername());
            Cookie userpassword = new Cookie("userpaaword",admin.getUserpw());
            Cookie type = new Cookie("type",admin.getUsertype()+"");
            username.setMaxAge(60*60*24*7);
            userpassword.setMaxAge(60*60*24*7);
            type.setMaxAge(60*60*24*7);
            username.setPath("/");
            userpassword.setPath("/");
            type.setPath("/");
            response.addCookie(username);
            response.addCookie(userpassword);
            response.addCookie(type);
            if (admin.getUsertype() == 0)
                return "redirect:/index/customer.html";//重定向登陆成功界面,重定向到管理员页面
            else
                return "";//重定向登陆成功界面,重定向到客户页面

        }
        else
            return "login";

    }

    @Override
    public int countUserName(String name) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        int i = adminMapper.countByExample(example);
        return i;
    }
}

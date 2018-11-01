package com.ssm.service;

import com.ssm.pojo.Admin;

import javax.servlet.http.HttpServletResponse;

public interface LoginService {

    public String login(Admin admin,HttpServletResponse response);
    int countUserName(String name);
}

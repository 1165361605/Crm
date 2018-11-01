package com.ssm.service.impl;

import com.ssm.mapper.AdminMapper;
import com.ssm.pojo.Admin;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean login(Admin admin) {
        Admin admin1 = adminMapper.selectLogin(admin);
        if (admin != null)
            return true;
        else
            return false;
    }
}

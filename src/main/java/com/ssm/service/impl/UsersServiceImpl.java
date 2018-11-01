package com.ssm.service.impl;

import com.ssm.mapper.UsersMapper;
import com.ssm.pojo.Users;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper mapper;

    @Override
    //通过id查询
    public Users selectUserById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Users selectUserByName(String name) {
        return mapper.selectByUserName(name);
    }
}

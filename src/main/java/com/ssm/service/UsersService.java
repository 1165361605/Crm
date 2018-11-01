package com.ssm.service;

import com.ssm.common.utils.Page;
import com.ssm.pojo.Users;

public interface UsersService {
    //通过id查询客户
    public Users selectUserById(Integer id);
    //通过姓名查询
    public Users selectUserByName(String name);
}

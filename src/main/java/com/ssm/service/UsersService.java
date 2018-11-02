package com.ssm.service;

import com.ssm.common.utils.Page;
import com.ssm.pojo.QueryVo;
import com.ssm.pojo.Users;

import java.util.List;

public interface UsersService {
    //查询用户列表
    List<Users> selectUserList();
    //通过id查询客户
    Users selectUserById(Integer id);
    //通过姓名、性别查询
    Page<Users> selectPageByQueryVo(QueryVo vo );
}

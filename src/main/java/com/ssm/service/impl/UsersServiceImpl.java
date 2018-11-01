package com.ssm.service.impl;

import com.ssm.mapper.UsersMapper;
import com.ssm.pojo.Users;
import com.ssm.pojo.UsersExample;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper mapper;

    public List<Users> selectUserList(){
        UsersExample example = new UsersExample();
        List<Users> list = mapper.selectByExample(example);
        System.out.println(list);
        return list;
    }

    @Override
    //通过id查询用户信息
    public Users selectUserById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    //通过用户名查询用户信息
    @Override
    public List<Users> selectUserByUserName(String UserName) {
        //获取UsersExample对象
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        //设置查询信息
        criteria.andUsernameEqualTo(UserName);
        //执行查询
        List<Users> list = mapper.selectByExample(example);
        if (list == null){
            return null;
        }
        //返回
        return list;
    }
}

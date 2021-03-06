package com.ssm.mapper;

import com.ssm.pojo.QueryVo;
import com.ssm.pojo.Users;
import com.ssm.pojo.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users selectByUserName(String username);
    //总条数
    Integer customerCountByQueryVo(QueryVo vo);
    //结果集
    List<Users> selectCustomerListByQueryVo(QueryVo vo);
}
package com.ssm.mapper;

import com.ssm.pojo.AdminExample;
import org.apache.ibatis.annotations.Param;
import com.ssm.pojo.Admin;

import java.util.List;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    Admin selectLogin(Admin admin);
}
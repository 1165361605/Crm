package com.ssm.service.impl;

import com.ssm.common.utils.Page;
import com.ssm.mapper.UsersMapper;
import com.ssm.pojo.QueryVo;
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
//    @Override
//    public List<Users> selectUserByUserName(String UserName) {
//        //获取UsersExample对象
//        UsersExample example = new UsersExample();
//        UsersExample.Criteria criteria = example.createCriteria();
//        //设置查询信息
//        criteria.andUsernameEqualTo(UserName);
//        //执行查询
//        List<Users> list = mapper.selectByExample(example);
//        if (list == null){
//            return null;
//        }
//        //返回
//        return list;
//    }

    // 通过2个条件 查询分页对象
    @Override
    public Page<Users> selectPageByQueryVo(QueryVo vo) {
        Page<Users> page = new Page<Users>();
        //每页数
        page.setSize(10);
        vo.setSize(10);

//===================================================================================================================
        /* 使用页面查询功能是启用 */
        if (null != vo) {//查询条件和页数不为空时进入
            // 判断当前页
            if (null != vo.getPage()) {//当前页码为多少
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() -1)*vo.getSize());//开始行索引,从0开始,在查询语句中有limit #{startRow},#{size}
            }

            if(null != vo.getUsername() && !"".equals(vo.getUsername().trim())){
                vo.setUsername(vo.getUsername().trim());//.trim()同时删除所有起始和结尾的空格
            }
            if(null != vo.getUsergender() && !"".equals(vo.getUsergender().trim())){
                 if (vo.getUsergender().equals("1")) {
                     vo.setUsergender("男");
                }
                 if(vo.getUsergender().equals("2")){
                     vo.setUsergender("女");
                 }
            }
//===================================================================================================================
            page.setTotal(mapper.customerCountByQueryVo(vo));//总条数
            page.setRows(mapper.selectCustomerListByQueryVo(vo));//所有结果
        }
        return page;
    }
}

package com.ssm.controller;

import com.ssm.common.utils.Page;
import com.ssm.pojo.QueryVo;
import com.ssm.pojo.Users;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @Autowired
    private UsersService usersService;
    /*
    * 跳转首页:并显示所有用户信息
    * 查询：根据用户名。性别查询用户
    * */
    @RequestMapping(value = "/customer/selectlist")
    private String selectUsersByNmae(QueryVo vo,Model model){
        //通过四个条件  查询分页对象
        //用QueryVo中的（客户来源、客户名称、所属行业、客户级别）在Customer表中查询，然后显示列表。
        Page<Users> page = usersService.selectPageByQueryVo(vo);
        model.addAttribute("page", page);
//		回显 查询记录
        model.addAttribute("username", vo.getUsername());
        return "customer";
    }
}

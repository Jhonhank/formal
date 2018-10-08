package com.qxglsys.formal.controller;

import com.qxglsys.formal.common.UserData;
import com.qxglsys.formal.entity.User;
import com.qxglsys.formal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/toUserList.do")
    public String toUserList(){
        return "/admin/user/list";
    }

    @RequestMapping("/toUserEdit.do")
    public String toUserEdit(){
        return "/admin/user/edit";
    }

    @RequestMapping("/userListData.do")
    @ResponseBody
    public UserData userListData(){
        List<User> sysUsers=userService.findAll();
        UserData userData=UserData.builder().code(0).msg("").count(100).data(sysUsers).build();
        return userData;
    }
}

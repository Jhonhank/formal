package com.qxglsys.formal.controller;

import com.qxglsys.formal.common.JsonData;
import com.qxglsys.formal.entity.AdminUser;
import com.qxglsys.formal.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@Slf4j
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping({"/","/*"})
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonData loginSuccess(@RequestParam("login") String uName, @RequestParam("pwd") String pwd,
                                 HttpServletRequest request, HttpServletResponse response){
        AdminUser adminUser=loginService.checkLogin(uName,pwd);
        if (adminUser!=null){
            request.getSession().setAttribute("user",adminUser);
            return JsonData.success("success","登陆成功");
        }else {
            return JsonData.failed("failed","账号或密码错误");
        }
    }

    @RequestMapping("/logout.do")
    public void logout(HttpServletRequest request,HttpServletResponse response)throws IOException {
        request.getSession().removeAttribute("user");
        response.sendRedirect("/");
    }

    @RequestMapping("/admin.html")
    public String login(){
        return "admin/admin";
    }
}

package com.qxglsys.formal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/order")
public class OrderController {

    @RequestMapping("/toOrderList.do")
    public String toOrderList(){
        return "/admin/order/list";
    }
}

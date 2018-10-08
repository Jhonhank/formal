package com.qxglsys.formal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductController {

    @RequestMapping("/toProductList.do")
    public String toProductList(){
        return "/admin/product/list";
    }
}

package com.qxglsys.formal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/category")
@Controller
public class CategoryController {

    @RequestMapping("/toCategoryOneList.do")
    public String toCategoryOneList(){
        return "/admin/category_one/list";
    }

    @RequestMapping("/toCategoryTwoList.do")
    public String toCategoryTwoList(){
        return "/admin/category_tow/list";
    }
}

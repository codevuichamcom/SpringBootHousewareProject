package com.example.housewareshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/listProduct")
    public String getListProducts(){
        return "listProduct";
    }

    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }

    @GetMapping("/listCart")
    public String getListCart(){
        return "listCart";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }

    @GetMapping("/prepareShipping")
    public String prepareShipping(){
        return "prepareShipping";
    }
}

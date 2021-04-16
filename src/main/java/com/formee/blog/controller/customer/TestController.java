package com.formee.blog.controller.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/16
 * @description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String testHello(){
        return "hello world!";
    }
}

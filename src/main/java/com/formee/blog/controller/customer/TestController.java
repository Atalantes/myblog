package com.formee.blog.controller.customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/16
 * @description:
 */
@Api(tags = "测试接口")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation("helloworld接口")
    @GetMapping("/hello")
    @ApiImplicitParam(name = "name", value = "用户名", defaultValue = "李四")
    public String testHello(@RequestParam String name){
        return "hello world!" + name;
    }
}

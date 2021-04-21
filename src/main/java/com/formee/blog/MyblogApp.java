package com.formee.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/16
 * @description:
 */
@SpringBootApplication
@EnableSwagger2
public class MyblogApp {
    public static void main(String[] args) {
        SpringApplication.run(MyblogApp.class, args);
    }
}

package com.formee.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/21
 * @description: 用户实体类抽象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 邮箱 - 需要格式校验
     */
    private String email;

    /**
     * 电话号码
     */
    private String phoneNum;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 在线状态
     */
    private Boolean onlineStatus;


}

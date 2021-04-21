package com.formee.blog.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/21
 * @description: 标签实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TagEntity extends BaseEntity{

    /**
     * 标签名称
     */
    private String name;

    /**
     * 软删除标记
     */
    private Boolean deleted;

    /**
     * 创建标签的用户
     */
    private Long userId;

}

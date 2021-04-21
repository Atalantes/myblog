package com.formee.blog.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/21
 * @description: 文章实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ArticleEntity extends BaseEntity{

    /**
     * 文章名称
     */
    private String name;

    /**
     * 软删除标记
     */
    private Boolean deleted;

    /**
     * 创建者id
     */
    private Long userId;

    /**
     * 标签
     */
    private List<Long> tagIds;

}

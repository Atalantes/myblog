package com.formee.blog.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/21
 * @description: 用户评论实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommentEntity extends BaseEntity{

    /**
     * 评论内容
     */
    private String contents;

    /**
     * 评论的文章id
     */
    private Long articleId;

    /**
     * 评论的用户id
     */
    private Long userId;

    /**
     * 软删除标记
     */
    private Boolean deleted;


}

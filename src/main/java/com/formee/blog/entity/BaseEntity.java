package com.formee.blog.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Jia Liang
 * @Date: 2021/4/21
 * @description: 实体基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity implements Serializable {

    /**
     * 版本id
     */
    private static final Long serialVersionUID = 5088697673359558320L;

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录最近修改时间
     */
    private Date updateTime;
}

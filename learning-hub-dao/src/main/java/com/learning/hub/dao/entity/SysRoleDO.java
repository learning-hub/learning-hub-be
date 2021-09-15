package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 角色表
 */
@Data
public class SysRoleDO implements Serializable {

    /**
     * 角色id
     */
    private Long id;

    /**
     * role名字
     */
    private String name;

    /**
     * role介绍
     */
    private String description;

    /**
     * role的父id
     */
    private Long parent;

    /**
     * 是否禁用 0-否,1-是 默认0
     */
    private Integer xsDisable;

    /**
     * 删除时间
     */
    private Date deletedAt;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 排序
     */
    private Integer order;

    private static final long serialVersionUID = 1L;
}

package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 题库标签关联表
 */
@Data
public class SysProblemTagDO implements Serializable {

    /**
     * 题库标签关联表id
     */
    private Long id;

    /**
     * 题库id
     */
    private Long problemId;

    /**
     * 标签id
     */
    private Long tagId;

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

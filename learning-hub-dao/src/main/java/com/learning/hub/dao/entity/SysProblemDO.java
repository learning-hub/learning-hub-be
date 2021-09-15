package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 题库表
 */
@Data
public class SysProblemDO implements Serializable {

    /**
     * 题库id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 标签id,每个标签id用,号隔开
     */
    private String tags;

    /**
     * 来源
     */
    private String source;

    /**
     * ac数
     */
    private Integer acCount;

    /**
     * 提交数
     */
    private Integer submitCount;

    /**
     * 题类型 0-CODE,1-SINGLE,2-MULTI,3-FILL
     */
    private Integer type;

    /**
     * 是否缓存到前端 0-否,1-是
     */
    private Integer xsCache;

    /**
     * 是否隐藏 0-否,1-是
     */
    private Integer xsHidden;

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

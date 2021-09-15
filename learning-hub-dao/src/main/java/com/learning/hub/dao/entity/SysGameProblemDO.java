package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 比赛题目关联表
 */
@Data
public class SysGameProblemDO implements Serializable {

    /**
     * 比赛题目id
     */
    private Long id;

    /**
     * 比赛id
     */
    private Long gameId;

    /**
     * 题目id
     */
    private Long problemId;

    /**
     * ac数
     */
    private Integer acCount;

    /**
     * 提交数
     */
    private Integer submitCount;

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

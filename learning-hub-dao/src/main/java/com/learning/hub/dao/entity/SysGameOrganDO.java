package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 比赛组织关联表
 */
@Data
public class SysGameOrganDO implements Serializable {

    /**
     * 比赛组织名单id
     */
    private Long id;

    /**
     * 比赛id
     */
    private Long gameId;

    /**
     * 组织id
     */
    private Long organId;

    /**
     * ac数
     */
    private Integer acCount;

    /**
     * ac正确率
     */
    private Integer acRate;

    /**
     * 提交数
     */
    private Integer submitCount;

    /**
     * 最后ac时间
     */
    private Date lastAcTime;

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

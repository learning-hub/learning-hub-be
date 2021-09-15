package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 组织表
 */
@Data
public class SysOrganDO implements Serializable {

    /**
     * 组织id
     */
    private Long id;

    /**
     * 组织名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 最多人
     */
    private Integer maxUser;

    /**
     * 关闭时间
     */
    private Date expired;

    /**
     * 公告
     */
    private String note;

    /**
     * 父组织
     */
    private Long parent;

    /**
     * 创建人
     */
    private Long createUserId;

    /**
     * 邀请码
     */
    private Integer code;

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

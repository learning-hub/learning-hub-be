package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 比赛表
 */
@Data
public class SysGameDO implements Serializable {

    /**
     * 比赛id
     */
    private Long id;

    /**
     * 比赛标题
     */
    private String title;

    /**
     * 比赛描述
     */
    private String description;

    /**
     * 比赛类型 0-个人,1-团队
     */
    private Integer type;

    /**
     * 举办人id
     */
    private Long createUserId;

    /**
     * 举办的组织id
     */
    private Long holdOrganId;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 时间长度 s
     */
    private Integer duration;

    /**
     * 限制人数
     */
    private Integer userLimit;

    /**
     * 是否私有 0-否,1-是 默认0
     */
    private Integer xsPrivate;

    /**
     * 参赛密码
     */
    private Integer code;

    /**
     * 是否隐藏 0-否,1-是 默认0
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

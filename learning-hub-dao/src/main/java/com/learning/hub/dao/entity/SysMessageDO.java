package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 消息模型表
 */
@Data
public class SysMessageDO implements Serializable {

    /**
     * 消息模型id
     */
    private Long id;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String body;

    /**
     * 消息类型 0-系统消息,1-用户消息
     */
    private Integer type;

    /**
     * 创建用户id
     */
    private Long createUserId;

    /**
     * 接受用户id
     */
    private Long acceptUserId;

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

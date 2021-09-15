package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 判题结果表
 */
@Data
public class SysJudgerDO implements Serializable {

    /**
     * 判题结果id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 团队id
     */
    private Long organId;

    /**
     * ip
     */
    private String ip;

    /**
     * 比赛id
     */
    private Long gameId;

    /**
     * 比赛中的题id
     */
    private Long gameProblemId;

    /**
     * 结果 0-正确,1-判题中,2-格式错误,3-答案错误,4-时间超限,5-内存超限,6-运行错误,7-编译错误,8-系统错误,9-队列中
     */
    private Integer result;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 消息队列id
     */
    private Long jubId;

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

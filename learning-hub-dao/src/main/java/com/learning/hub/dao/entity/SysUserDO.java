package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 用户表
 */
@Data
public class SysUserDO implements Serializable {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 性别 0-未知,1-男,2-女
     */
    private Integer sex;

    /**
     * 姓名
     */
    private String realname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 是否公开私密信息 0-否,1-是 默认0
     */
    private Integer xsPublicPrivate;

    /**
     * 备注，个性签名
     */
    private String note;

    /**
     * ac数
     */
    private Integer acCount;

    /**
     * 提交数
     */
    private Integer submitCount;

    /**
     * 参加比赛的数
     */
    private Integer gameCount;

    /**
     * 经验值
     */
    private Integer exp;

    /**
     * 所属组织id
     */
    private Long organId;

    /**
     * 是否禁赛 0-否,1-是 默认0
     */
    private Integer xsDisableGame;

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

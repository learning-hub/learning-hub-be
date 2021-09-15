package com.learning.hub.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 路由表
 */
@Data
public class SysRouterDO implements Serializable {

    /**
     * 路由id
     */
    private Long id;

    /**
     * api名字
     */
    private String name;

    /**
     * api路由
     */
    private String router;

    /**
     * 请求类型
     */
    private String type;

    /**
     * url参数
     */
    private String urlParameter;

    /**
     * body参数
     */
    private String bodyParameter;

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

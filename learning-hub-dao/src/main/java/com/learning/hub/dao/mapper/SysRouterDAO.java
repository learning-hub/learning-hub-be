package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysRouterDAO继承基类
 */
@Mapper
@Repository
public interface SysRouterDAO extends MyBatisBaseDao<SysRouterDAO, Long> {

}

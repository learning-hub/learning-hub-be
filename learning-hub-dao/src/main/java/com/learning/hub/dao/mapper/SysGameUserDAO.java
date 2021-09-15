package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysGameUserDAO继承基类
 */
@Mapper
@Repository
public interface SysGameUserDAO extends MyBatisBaseDao<SysGameUserDAO, Long> {
}

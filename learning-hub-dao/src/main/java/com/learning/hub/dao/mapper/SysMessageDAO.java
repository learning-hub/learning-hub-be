package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysMessageDAO继承基类
 */
@Mapper
@Repository
public interface SysMessageDAO extends MyBatisBaseDao<SysMessageDAO, Long> {

}

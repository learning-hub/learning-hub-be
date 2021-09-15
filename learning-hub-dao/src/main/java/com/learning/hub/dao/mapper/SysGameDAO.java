package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysGameDAO继承基类
 */
@Mapper
@Repository
public interface SysGameDAO extends MyBatisBaseDao<SysGameDAO, Long> {

}

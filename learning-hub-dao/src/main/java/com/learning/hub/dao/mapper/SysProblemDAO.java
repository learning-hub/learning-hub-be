package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysProblemDAO继承基类
 */
@Mapper
@Repository
public interface SysProblemDAO extends MyBatisBaseDao<SysProblemDAO, Long> {

}

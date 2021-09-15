package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysProblemTagDAO继承基类
 */
@Mapper
@Repository
public interface SysProblemTagDAO extends MyBatisBaseDao<SysProblemTagDAO, Long> {

}

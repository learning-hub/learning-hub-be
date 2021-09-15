package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysTagDAO继承基类
 */
@Mapper
@Repository
public interface SysTagDAO extends MyBatisBaseDao<SysTagDAO, Long>{

}

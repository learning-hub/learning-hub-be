package com.learning.hub.dao.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysUserDAO继承基类
 */
@Mapper
@Repository
public interface SysUserDAO extends MyBatisBaseDao<SysUserDAO, Long>{

}

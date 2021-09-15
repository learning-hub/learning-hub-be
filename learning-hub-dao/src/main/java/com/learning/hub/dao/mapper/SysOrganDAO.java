package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysOrganDAO继承基类
 */
@Mapper
@Repository
public interface SysOrganDAO extends MyBatisBaseDao<SysOrganDAO, Long> {

}

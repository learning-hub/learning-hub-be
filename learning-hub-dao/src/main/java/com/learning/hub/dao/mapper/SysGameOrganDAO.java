package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SysGameOrganDAO继承基类
 */
@Mapper
@Repository
public interface SysGameOrganDAO extends MyBatisBaseDao<SysGameOrganDAO, Long> {

}

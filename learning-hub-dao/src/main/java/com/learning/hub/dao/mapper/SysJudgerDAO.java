package com.learning.hub.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @author SysJudgerDAO继承基类
 */
@Mapper
@Repository
public interface SysJudgerDAO extends MyBatisBaseDao<SysJudgerDAO, Long> {

}

package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysUserRoleDAO;
import com.learning.hub.pt.service.manager.SysUserRoleManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysUserRoleManager
 */
@Log4j2
@Component("sysUserRoleManager")
public class SysUserRoleManagerImpl implements SysUserRoleManager {

    @Autowired
    private SysUserRoleDAO sysUserRoleDAO;
}

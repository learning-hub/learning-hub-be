package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysRoleDAO;
import com.learning.hub.pt.service.manager.SysRoleManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysRoleManager
 */
@Log4j2
@Component("sysRoleManager")
public class SysRoleManagerImpl implements SysRoleManager {

    @Autowired
    private SysRoleDAO sysRoleDAO;
}

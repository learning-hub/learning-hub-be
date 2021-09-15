package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysRoleRouterDAO;
import com.learning.hub.pt.service.manager.SysRoleRouterManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysRoleRouterManager
 */
@Log4j2
@Component("sysRoleRouterManager")
public class SysRoleRouterManagerImpl implements SysRoleRouterManager {

    @Autowired
    private SysRoleRouterDAO sysRoleRouterDAO;
}

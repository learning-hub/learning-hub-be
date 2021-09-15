package com.learning.hub.pt.domain.user.impl;

import com.learning.hub.pt.domain.user.SysRoleRouterService;
import com.learning.hub.pt.service.manager.SysRoleRouterManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysRoleRouterService
 */
@Log4j2
@Component("sysRoleRouterService")
public class SysRoleRouterServiceImpl implements SysRoleRouterService {

    @Autowired
    private SysRoleRouterManager sysRoleRouterManager;
}

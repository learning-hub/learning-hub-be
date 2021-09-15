package com.learning.hub.pt.domain.user.impl;

import com.learning.hub.pt.domain.user.SysRoleService;
import com.learning.hub.pt.service.manager.SysRoleManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysRoleService
 */
@Log4j2
@Component("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleManager sysRoleManager;
}

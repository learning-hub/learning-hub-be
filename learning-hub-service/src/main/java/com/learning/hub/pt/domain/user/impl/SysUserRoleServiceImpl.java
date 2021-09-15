package com.learning.hub.pt.domain.user.impl;

import com.learning.hub.pt.domain.user.SysUserRoleService;
import com.learning.hub.pt.service.manager.SysUserRoleManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysUserRoleService
 */
@Log4j2
@Component("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private SysUserRoleManager sysUserRoleManager;
}

package com.learning.hub.pt.domain.user.impl;

import com.learning.hub.pt.domain.user.SysUserService;
import com.learning.hub.pt.service.manager.SysUserManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysUserService
 */
@Log4j2
@Component("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserManager sysUserManager;
}

package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysUserDAO;
import com.learning.hub.pt.service.manager.SysUserManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysUserManager
 */
@Log4j2
@Component("sysUserManager")
public class SysUserManagerImpl implements SysUserManager {

    @Autowired
    private SysUserDAO sysUserDAO;
}

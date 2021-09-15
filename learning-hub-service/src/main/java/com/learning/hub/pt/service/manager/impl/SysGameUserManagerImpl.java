package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysGameUserDAO;
import com.learning.hub.pt.service.manager.SysGameUserManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameUserManager
 */
@Log4j2
@Component("sysGameUserManager")
public class SysGameUserManagerImpl implements SysGameUserManager {

    @Autowired
    private SysGameUserDAO sysGameUserDAO;
}

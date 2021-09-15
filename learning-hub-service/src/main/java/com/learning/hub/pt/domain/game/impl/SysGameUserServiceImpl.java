package com.learning.hub.pt.domain.game.impl;

import com.learning.hub.pt.domain.game.SysGameUserService;
import com.learning.hub.pt.service.manager.SysGameUserManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameUserService
 */
@Log4j2
@Component("sysGameUserService")
public class SysGameUserServiceImpl implements SysGameUserService {

    @Autowired
    private SysGameUserManager sysGameUserManager;
}

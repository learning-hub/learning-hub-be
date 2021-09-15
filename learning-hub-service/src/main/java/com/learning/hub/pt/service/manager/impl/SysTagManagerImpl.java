package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysTagDAO;
import com.learning.hub.pt.service.manager.SysTagManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysTagManager
 */
@Log4j2
@Component("sysTagManager")
public class SysTagManagerImpl implements SysTagManager {

    @Autowired
    private SysTagDAO sysTagDAO;
}

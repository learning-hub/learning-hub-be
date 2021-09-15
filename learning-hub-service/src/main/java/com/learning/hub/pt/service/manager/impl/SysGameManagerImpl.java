package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysGameDAO;
import com.learning.hub.pt.service.manager.SysGameManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameManager
 */
@Log4j2
@Component("sysGameManager")
public class SysGameManagerImpl implements SysGameManager {

    @Autowired
    private SysGameDAO sysGameDAO;
}

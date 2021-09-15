package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysRouterDAO;
import com.learning.hub.pt.service.manager.SysRouterManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysRouterManager
 */
@Log4j2
@Component("sysRouterManager")
public class SysRouterManagerImpl implements SysRouterManager {

    @Autowired
    private SysRouterDAO sysRouterDAO;
}

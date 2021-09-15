package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysMessageDAO;
import com.learning.hub.pt.service.manager.SysMessageManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysMessageManager
 */
@Log4j2
@Component("sysMessageManager")
public class SysMessageManagerImpl implements SysMessageManager {

    @Autowired
    private SysMessageDAO sysMessageDAO;
}

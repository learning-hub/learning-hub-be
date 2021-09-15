package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysOrganDAO;
import com.learning.hub.pt.service.manager.SysOrganManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysOrganManager
 */
@Log4j2
@Component("sysOrganManager")
public class SysOrganManagerImpl implements SysOrganManager {

    @Autowired
    private SysOrganDAO sysOrganDAO;
}

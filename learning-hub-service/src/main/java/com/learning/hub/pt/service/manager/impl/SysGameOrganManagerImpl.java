package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysGameOrganDAO;
import com.learning.hub.pt.service.manager.SysGameOrganManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameOrganManager
 */
@Log4j2
@Component("sysGameOrganManager")
public class SysGameOrganManagerImpl implements SysGameOrganManager {

    @Autowired
    private SysGameOrganDAO sysGameOrganDAO;
}

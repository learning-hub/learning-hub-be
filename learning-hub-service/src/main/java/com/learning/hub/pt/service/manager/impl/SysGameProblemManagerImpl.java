package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysGameProblemDAO;
import com.learning.hub.pt.service.manager.SysGameProblemManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameProblemManager
 */
@Log4j2
@Component("sysGameProblemManager")
public class SysGameProblemManagerImpl implements SysGameProblemManager {

    @Autowired
    private SysGameProblemDAO sysGameProblemDAO;
}

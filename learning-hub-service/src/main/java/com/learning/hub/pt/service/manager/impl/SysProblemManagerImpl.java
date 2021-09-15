package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysProblemDAO;
import com.learning.hub.pt.service.manager.SysProblemManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysProblemManager
 */
@Log4j2
@Component("sysProblemManager")
public class SysProblemManagerImpl implements SysProblemManager {

    @Autowired
    private SysProblemDAO sysProblemDAO;
}

package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysProblemTagDAO;
import com.learning.hub.pt.service.manager.SysProblemTagManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysProblemTagManager
 */
@Log4j2
@Component("sysProblemTagManager")
public class SysProblemTagManagerImpl implements SysProblemTagManager {

    @Autowired
    private SysProblemTagDAO sysProblemTagDAO;
}

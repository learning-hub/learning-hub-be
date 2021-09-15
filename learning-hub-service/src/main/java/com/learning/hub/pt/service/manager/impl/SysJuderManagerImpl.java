package com.learning.hub.pt.service.manager.impl;

import com.learning.hub.dao.mapper.SysJudgerDAO;
import com.learning.hub.pt.service.manager.SysJudgerManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysJudgerManager
 */
@Log4j2
@Component("sysJudgerManager")
public class SysJuderManagerImpl implements SysJudgerManager {

    @Autowired
    private SysJudgerDAO sysJudgerDAO;
}

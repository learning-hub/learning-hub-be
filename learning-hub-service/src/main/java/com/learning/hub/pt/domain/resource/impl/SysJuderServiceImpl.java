package com.learning.hub.pt.domain.resource.impl;

import com.learning.hub.pt.domain.resource.SysJudgerService;
import com.learning.hub.pt.service.manager.SysJudgerManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysJudgerService
 */
@Log4j2
@Component("sysJudgerService")
public class SysJuderServiceImpl implements SysJudgerService {

    @Autowired
    private SysJudgerManager sysJudgerManager;
}

package com.learning.hub.pt.domain.game.impl;

import com.learning.hub.pt.domain.game.SysGameProblemService;
import com.learning.hub.pt.service.manager.SysGameProblemManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameProblemService
 */
@Log4j2
@Component("sysGameProblemService")
public class SysGameProblemServiceImpl implements SysGameProblemService {

    @Autowired
    private SysGameProblemManager sysGameProblemManager;
}

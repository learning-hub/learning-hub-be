package com.learning.hub.pt.domain.game.impl;

import com.learning.hub.pt.domain.game.SysGameService;
import com.learning.hub.pt.service.manager.SysGameManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameService
 */
@Log4j2
@Component("sysGameService")
public class SysGameServiceImpl implements SysGameService {

    @Autowired
    private SysGameManager sysGameManager;
}

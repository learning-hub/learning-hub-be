package com.learning.hub.pt.domain.game.impl;

import com.learning.hub.pt.domain.game.SysGameOrganService;
import com.learning.hub.pt.service.manager.SysGameOrganManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysGameOrganService
 */
@Log4j2
@Component("sysGameOrganService")
public class SysGameOrganServiceImpl implements SysGameOrganService {

    @Autowired
    private SysGameOrganManager sysGameOrganManager;
}

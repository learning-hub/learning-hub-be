package com.learning.hub.pt.domain.user.impl;

import com.learning.hub.pt.domain.user.SysOrganService;
import com.learning.hub.pt.service.manager.SysOrganManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysOrganService
 */
@Log4j2
@Component("sysOrganService")
public class SysOrganServiceImpl implements SysOrganService {

    @Autowired
    private SysOrganManager sysOrganManager;
}

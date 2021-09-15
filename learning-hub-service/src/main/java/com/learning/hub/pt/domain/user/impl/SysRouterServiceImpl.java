package com.learning.hub.pt.domain.user.impl;

import com.learning.hub.pt.domain.user.SysRouterService;
import com.learning.hub.pt.service.manager.SysRouterManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysRouterService
 */
@Log4j2
@Component("sysRouterService")
public class SysRouterServiceImpl implements SysRouterService {

    @Autowired
    private SysRouterManager sysRouterManager;
}

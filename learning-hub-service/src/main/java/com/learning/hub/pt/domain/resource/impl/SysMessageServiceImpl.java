package com.learning.hub.pt.domain.resource.impl;

import com.learning.hub.pt.domain.resource.SysMessageService;
import com.learning.hub.pt.service.manager.SysMessageManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysMessageService
 */
@Log4j2
@Component("sysMessageService")
public class SysMessageServiceImpl implements SysMessageService {

    @Autowired
    private SysMessageManager sysMessageManager;
}

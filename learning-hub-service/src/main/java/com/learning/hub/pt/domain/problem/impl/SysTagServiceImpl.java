package com.learning.hub.pt.domain.problem.impl;

import com.learning.hub.pt.domain.problem.SysTagService;
import com.learning.hub.pt.service.manager.SysTagManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysTagService
 */
@Log4j2
@Component("sysTagService")
public class SysTagServiceImpl implements SysTagService {

    @Autowired
    private SysTagManager sysTagManager;
}

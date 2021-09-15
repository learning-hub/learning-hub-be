package com.learning.hub.pt.domain.problem.impl;

import com.learning.hub.pt.domain.problem.SysProblemTagService;
import com.learning.hub.pt.service.manager.SysProblemTagManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysProblemTagService
 */
@Log4j2
@Component("sysProblemTagService")
public class SysProblemTagServiceImpl implements SysProblemTagService {

    @Autowired
    private SysProblemTagManager sysProblemTagManager;
}

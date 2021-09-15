package com.learning.hub.pt.domain.problem.impl;

import com.learning.hub.pt.domain.problem.SysProblemService;
import com.learning.hub.pt.service.manager.SysProblemManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sysProblemService
 */
@Log4j2
@Component("sysProblemService")
public class SysProblemServiceImpl implements SysProblemService {

    @Autowired
    private SysProblemManager sysProblemManager;
}

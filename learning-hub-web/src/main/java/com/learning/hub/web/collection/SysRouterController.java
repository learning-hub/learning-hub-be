package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.user.SysRouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author router controller
 */
@RestController
@RequestMapping("/api/learninghub/router")
public class SysRouterController {

    @Autowired
    private SysRouterService sysRouterService;
}

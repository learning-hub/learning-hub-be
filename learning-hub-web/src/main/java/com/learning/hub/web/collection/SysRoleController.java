package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.user.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author role controller
 */
@RestController
@RequestMapping("/api/learninghub/role")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;
}

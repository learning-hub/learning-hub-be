package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author user controller
 */
@RestController
@RequestMapping("/api/learninghub/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
}

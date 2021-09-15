package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.user.SysOrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author organ controller
 */
@RestController
@RequestMapping("/api/learninghub/organ")
public class SysOrganController {

    @Autowired
    private SysOrganService sysOrganService;
}

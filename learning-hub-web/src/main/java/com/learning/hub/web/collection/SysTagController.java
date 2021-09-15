package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.problem.SysTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tag controller
 */
@RestController
@RequestMapping("/api/learninghub/tag")
public class SysTagController {

    @Autowired
    private SysTagService sysTagService;
}

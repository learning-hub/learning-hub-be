package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.resource.SysJudgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author judger controller
 */
@RestController
@RequestMapping("/api/learninghub/judger")
public class SysJudgerController {

    @Autowired
    private SysJudgerService sysJudgerService;
}

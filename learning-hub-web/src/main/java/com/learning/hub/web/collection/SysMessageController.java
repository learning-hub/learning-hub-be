package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.resource.SysMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author message controller
 */
@RestController
@RequestMapping("/api/learninghub/message")
public class SysMessageController {

    @Autowired
    private SysMessageService sysMessageService;
}

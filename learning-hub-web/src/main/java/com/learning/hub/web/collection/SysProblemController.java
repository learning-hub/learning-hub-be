package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.problem.SysProblemTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author problem controller
 */
@RestController
@RequestMapping("/api/learninghub/problem")
public class SysProblemController {

    @Autowired
    private SysProblemTagService sysProblemTagService;
}

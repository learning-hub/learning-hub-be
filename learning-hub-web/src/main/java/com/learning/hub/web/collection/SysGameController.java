package com.learning.hub.web.collection;

import com.learning.hub.pt.domain.game.SysGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author game controller
 */
@RestController
@RequestMapping("/api/learninghub/game")
public class SysGameController {

    @Autowired
    private SysGameService sysGameService;
}

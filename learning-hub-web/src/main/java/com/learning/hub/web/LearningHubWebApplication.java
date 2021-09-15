package com.learning.hub.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lnh
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.learning.hub.common",
        "com.learning.hub.dao",
        "com.learning.hub.pt",
        "com.learning.hub.web"
})
@MapperScan("com.learning.hub.dao.mapper")
public class LearningHubWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningHubWebApplication.class, args);
    }
}

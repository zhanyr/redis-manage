package io.github.redismanage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhanyr
 * @Create 2016-12-14 1:16 PM
 * @Desc
 */
@RestController
@SpringBootApplication
public class AddRedisServerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddRedisServerController.class);

    @RequestMapping("/add_server")
    String addRedisServer(){
//        System.out.println("hello");
//        return "hello world!";
        return null;
    }
}
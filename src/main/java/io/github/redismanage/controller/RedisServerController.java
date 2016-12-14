package io.github.redismanage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhanyr
 * @Create 2016-12-14 1:16 PM
 * @Desc 跟redis服务器相关的api
 */
@RestController
@SpringBootApplication
public class RedisServerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisServerController.class);

    /**
     * 添加redis server, 到配置文件中
     * 逻辑:
     *     1. redis server 不存在
     * @return
     */
    @RequestMapping("/add_server")
    public String addRedisServer(){
//        System.out.println("hello");
//        return "hello world!";
        return null;
    }
}
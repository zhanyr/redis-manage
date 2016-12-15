package io.github.redismanage.service.impl;

import io.github.redismanage.RedisManageApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by zhanyr
 * datetime: 12/15/16 1:38 PM
 * introduction
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = RedisManageApplication.class)
public class RedisServerServiceTest {

    @Autowired
    private RedisServerService redisServerService;

    @Test
    public void addServer() throws Exception {
        redisServerService.addServer("localhost", "127.0.0.1", "6379", "");
    }

    @Test
    public void gerServerId() throws Exception {

    }
}
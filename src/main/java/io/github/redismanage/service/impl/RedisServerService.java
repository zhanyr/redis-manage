package io.github.redismanage.service.impl;

import io.github.redismanage.service.IRedisServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-12-14 4:07 PM
 * @Desc
 */
public class RedisServerService implements IRedisServerService{
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisServerService.class);

    @Override
    public int addServer(String name, String host, String port, String password) throws Exception {
        return 0;
    }

    @Override
    public int gerServerId() throws Exception {
        return 0;
    }
}
package io.github.redismanage.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-12-14 12:21 PM
 * @Desc
 */
public class RedisServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisServer.class);

    //支持多个server,id从0开始
    private int id;

    //server的名称,如localhost,默认是当前server的ip
    private String name;

    //server的ip
    private String host;

    //端口
    private String port;

    //密码
    private String password;

    public RedisServer(int id, String name, String host, String port, String password) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
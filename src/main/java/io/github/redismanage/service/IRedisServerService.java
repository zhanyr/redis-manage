package io.github.redismanage.service;

/**
 * @Author zhanyr
 * @Create 2016-12-14 4:07 PM
 * @Desc
 */
public interface IRedisServerService {


    /**
     * 添加redis server
     * @param name server名称
     * @param host ip
     * @param port 端口
     * @param password 密码
     * @return
     * @throws Exception
     */
    int addServer(String name, String host, String port, String password) throws Exception;

    /**
     * 获取一个合法的server id
     * @return
     * @throws Exception
     */
    int gerServerId() throws Exception;
}

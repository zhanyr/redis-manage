package io.github.redismanage.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-12-14 4:24 PM
 * @Desc
 */
public class ConfigUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigUtils.class);

    public static final String ConfigFilePath = System.getProperty("user.home")+"/redis_manage_config.properties";

    //最小有效server id
    public static final String MIN_VALID_ID = "min_valid_id";

    //目前存在的redis server的数量
    public static final String SERVER_NUM = "server_num";

    //redis server的名称
    public static final String SERVER_NAME = "server_name";

    //redis server的ip
    public static final String SERVER_HOST = "server_host";

    //redis server的端口
    public static final String SERVER_PORT = "server_port";

    public static int add(String key, String value){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
    }
}
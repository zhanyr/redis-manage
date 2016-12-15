package io.github.redismanage.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author zhanyr
 * @Create 2016-12-14 4:24 PM
 * @Desc
 */
public class ConfigUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigUtils.class);

    public static final String CONFIG_FILE = System.getProperty("user.home")+"/redis_manage_config.properties";

    //用位表示的server ids
    public static final String IDS = "ids";

    //目前存在的redis server的数量
    public static final String SERVER_NUM = "server_num";

    //redis server的名称
    public static final String SERVER_NAME = "server_name_";

    //redis server的ip
    public static final String SERVER_HOST = "server_host_";

    //redis server的端口
    public static final String SERVER_PORT = "server_port_";

    //redis server的密码
    public static final String SERVER_PWD = "server_pwd_";

    //添加单独的键值对配置
    public static void addConfig(String key, String value) throws Exception {
        PropertyUtils.add(CONFIG_FILE, key, value);
    }

    public static void addConfig(Map<String, String> keyValues) throws Exception {
        PropertyUtils.add(CONFIG_FILE, keyValues);
    }

    //根据key获取配置
    public static String getServerConfigByKey(String key) throws Exception {
        return PropertyUtils.getValueByKey(CONFIG_FILE, key);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
    }
}
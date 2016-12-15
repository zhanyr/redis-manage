package io.github.redismanage.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;


/**
 * @Author zhanyr
 * @Create 2016-12-14 4:41 PM
 * @Desc
 */
public class PropertyUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyUtils.class);

    public static Properties loadProperties(String propertyFile) throws Exception{
        InputStream inputStream = null;
        try {
            File file = new File(propertyFile);
            if(!file.exists()){
                file.createNewFile();
            }

            inputStream = new BufferedInputStream(new FileInputStream(propertyFile));

            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            LOGGER.error("加载配置文件异常...", e);
            throw new IOException(e);
        } finally {
            if(null != inputStream){
                inputStream.close();
            }
        }

    }

    /**
     * 添加或修改
     * @param propertyFile
     * @param key
     * @param value
     * @throws Exception
     */
    public static void add(String propertyFile, String key, String value) throws Exception{
        Properties prop = loadProperties(propertyFile);
        OutputStream outputStream = new FileOutputStream(propertyFile);
        prop.setProperty(key, value);
        prop.store(outputStream, "add key = " + key + ", value = " + value);
    }

    /**
     * 一次添加或修改多个键值对
     * @param propertyFile
     * @param keyValue
     * @throws Exception
     */
    public static void add(String propertyFile, Map<String, String> keyValue) throws Exception {
        Properties prop = loadProperties(propertyFile);
        OutputStream outputStream = new FileOutputStream(propertyFile);
        for (Map.Entry<String, String> entry:keyValue.entrySet()) {
            prop.setProperty(entry.getKey(), entry.getValue());
        }
        prop.store(outputStream, "add keyValues. keyValues = " + keyValue.toString());
    }


    /**
     * 删除key
     * @param propertyFile
     * @param key
     * @throws Exception
     */
    public static void remove(String propertyFile, String key) throws Exception {
        Properties properties = loadProperties(propertyFile);
        OutputStream outputStream = new FileOutputStream(propertyFile);
        properties.remove(key);
        properties.store(outputStream, "delete key = " + key);
    }

    /**
     * 根据key获取对应的配置
     * @param propertyFile
     * @param key
     * @return
     * @throws Exception
     */
    public static String getValueByKey(String propertyFile, String key) throws Exception {
        Properties properties = loadProperties(propertyFile);
        return Optional.ofNullable(properties.getProperty(key)).orElse("");
    }
}
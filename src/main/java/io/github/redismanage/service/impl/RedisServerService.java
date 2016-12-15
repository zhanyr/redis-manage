package io.github.redismanage.service.impl;

import io.github.redismanage.service.IRedisServerService;
import io.github.redismanage.util.ConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhanyr
 * @Create 2016-12-14 4:07 PM
 * @Desc
 */
@Service
public class RedisServerService implements IRedisServerService{
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisServerService.class);

    @Override
    public int addServer(String name, String host, String port, String password) throws Exception {
        int serverId = this.gerServerId();
        if(-1 == serverId){
            throw new Exception("server 太多啦,请删除几个嘛...");
        }

        //TODO 检测用密码是否正确


        //TODO 如果这里出现问题,将会发生ids被改变, 但是server配置信息未更新上的问题
        Map<String, String> keyValues = new HashMap<String, String>();
        keyValues.put(ConfigUtils.SERVER_NAME + serverId, name);
        keyValues.put(ConfigUtils.SERVER_HOST + serverId, host);
        keyValues.put(ConfigUtils.SERVER_PORT + serverId, port);
        keyValues.put(ConfigUtils.SERVER_PWD + serverId, password);
        ConfigUtils.addConfig(keyValues);

        return serverId;
    }

    /**
     * 从ids中取最低位是0处于第几位,id就是几,id只支持32个 0-31
     * 比如 ids是
     * 0000 0000 0000 0000 0000 0000 0001 0011 那么id就是2,因为从右边从0开始数第2位是0
     * @return
     * @throws Exception
     */
    @Override
    public int gerServerId() throws Exception {
        String idsStr = ConfigUtils.getServerConfigByKey(ConfigUtils.IDS);
        int ids = 0;
        if(!StringUtils.isEmpty(idsStr)){
            ids = Integer.parseInt(idsStr);
        }
        for(int i= 0; i<32; i++){
            //右移再左移如果跟之前相等,则表示这一位是0
            if(ids>>1<<1 == ids){
                //将这一位置1放回配置中,返回这一位的位置
                ConfigUtils.addConfig(ConfigUtils.IDS, String.valueOf(ids | (1 << i)));
                return i;
            }
            i++;
            ids = ids>>1;
        }
        LOGGER.info("已经达到32个server...");
        return -1;
    }

    public static void main(String[] args) {
        int id = 3;
        int id2 = 2;

        System.out.println(id>>1<<1);
        System.out.println(id);
        System.out.println(id2>>1<<1);
    }
}
package com.demo;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by lonel on 2017/5/30.
 */
public class TestPublish {
    @Test
    public void testPublish() throws Exception{
        Jedis jedis = new Jedis("localhost");
        jedis.publish("redisChatTest", "我是天才");
        Thread.sleep(5000);
        jedis.publish("redisChatTest", "我牛逼");
        Thread.sleep(5000);
        jedis.publish("redisChatTest", "哈哈");
    }

}

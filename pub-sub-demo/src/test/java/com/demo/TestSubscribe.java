package com.demo;

import com.demo.message.RedisMsgPubSubListener;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Unit test for simple App.
 */
public class TestSubscribe {
    @Test
    public void testSubscribe() throws Exception {
        Jedis jedis = new Jedis("localhost");
        RedisMsgPubSubListener listener = new RedisMsgPubSubListener();
        jedis.subscribe(listener, "redisChatTest");
        //other code
    }
}

package com.demo;

import com.demo.message.MessageConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by lonel on 2017/5/30.
 */
public class PubSubMain {

    RedisTemplate<String,Object> redisTemplate;

    public  void execute() {
        String channel = "pubsub:queue";
        redisTemplate.convertAndSend(channel, "from testData");
    }
    public static void main(String[] args) {
        ApplicationContext applicationContext   = new AnnotationConfigApplicationContext(MessageConfig.class);
        PubSubMain pubSubMain = new PubSubMain();
        pubSubMain.redisTemplate = (RedisTemplate<String, Object>) applicationContext.getBean("redisTemplate");
        pubSubMain.execute();
    }

}

package com.demo;

import com.alibaba.fastjson.JSONObject;
import com.demo.message.Body;
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
        Body body = new Body();
        body.setId(1000L);
        body.setName("weiwei");
        redisTemplate.convertAndSend(channel, JSONObject.toJSONString(body));
    }
    public static void main(String[] args) {
        ApplicationContext applicationContext   = new AnnotationConfigApplicationContext(MessageConfig.class);
        PubSubMain pubSubMain = new PubSubMain();
        pubSubMain.redisTemplate = (RedisTemplate<String, Object>) applicationContext.getBean("redisTemplate");
        pubSubMain.execute();
    }

}

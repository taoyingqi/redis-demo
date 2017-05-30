package com.demo.message;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class RedisMessageListener implements MessageListener {
    private Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void onMessage(final Message message, final byte[] pattern ) {
        LOG.info("[Message Channel={}]", message.getChannel());
        Body body = JSONObject.parseObject(message.toString(), Body.class);
        LOG.info("[Message: id={}, name={}]", body.getId(), body.getName());
    }
}

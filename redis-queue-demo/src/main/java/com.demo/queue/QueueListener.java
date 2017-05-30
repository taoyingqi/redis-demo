package com.demo.queue;

import org.springframework.stereotype.Component;

/**
 * Created by lonel on 2017/5/28.
 */
@Component
public class QueueListener<String> implements RedisQueueListener<String> {
    @Override
    public void onMessage(String value) {
        System.out.println(value);
    }
}

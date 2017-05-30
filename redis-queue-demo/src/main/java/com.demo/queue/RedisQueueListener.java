package com.demo.queue;

/**
 * Created by lonel on 2017/5/28.
 */
public interface RedisQueueListener<T> {
    void onMessage(T value);
}

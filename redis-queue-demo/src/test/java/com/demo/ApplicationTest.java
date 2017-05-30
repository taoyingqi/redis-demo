package com.demo;

import com.demo.queue.RedisQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lonel on 2017/5/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private RedisQueue<String> redisQueue;

    @Test
    public void test() throws Exception {
        redisQueue.pushFromHead("test:app");
        Thread.sleep(15000);
        redisQueue.pushFromHead("test:app");
        Thread.sleep(15000);
        redisQueue.destroy();
    }
}

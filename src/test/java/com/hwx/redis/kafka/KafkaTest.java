package com.hwx.redis.kafka;

import com.hwx.Application;
import com.hwx.kafka.Consumer1;
import com.hwx.kafka.Producer1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Huawei Xie
 * @date: 2019/9/3
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class KafkaTest {

    @Autowired
    private Producer1 producer;

    @Autowired
    private Consumer1 consumer;
    @Test
    public void produce1() {
        producer.producerMessage();
    }

    @Test
    public void consumer() {
        String str1 = "789";
        Str(str1);
        System.out.println(str1);
        //consumer.consumerMessage();
        Queue queue = new LinkedList();
        System.out.println(null == queue.poll());
    }
    public void Str (String str1) {
        str1 = "123";
    }

}

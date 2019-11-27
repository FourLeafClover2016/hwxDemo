package com.hwx.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Service;

import java.util.Properties;
import java.util.UUID;

/**
 * @author: Huawei Xie
 * @date: 2019/9/1
 */
@Service
public class Producer1 {
    public void producerMessage() {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "10.121.198.132:19092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.ACKS_CONFIG, "-1");
        //    properties.put(ProducerConfig.RETRIES_CONFIG, "1");
        //properties.put(ProducerConfig.LINGER_MS_CONFIG, "10");
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, "33554432");
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, "323840");
        //    properties.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, "3000");
        Producer<String, String> producer = new KafkaProducer<String, String>(properties);
        for (int i = 0; i < 100; i++) {
            producer.send(new ProducerRecord<>("mytopic", UUID.randomUUID().toString(), "this a message"));
        }
        producer.close();
    }
}

package com.hwx.kafka.ThreadConsumer;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.security.PublicKey;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: Huawei Xie
 * @date: 2019/9/3
 */
public class ConsumerThreadHander<K, V> {
    private final KafkaConsumer<K,V> consumer;
    private ExecutorService executorService;
    private final Map<TopicPartition, OffsetAndMetadata> offsets = new HashMap<>();
    public ConsumerThreadHander() {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.124.68:9092");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "groud3");
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumer = new KafkaConsumer<>(properties);
        consumer.subscribe(Arrays.asList("mytopic"), new ConsumerRebalanceListener() {
            @Override
            public void onPartitionsRevoked(Collection<TopicPartition> collection) {
                consumer.commitSync(offsets);
            }

            @Override
            public void onPartitionsAssigned(Collection<TopicPartition> collection) {
                offsets.clear();
            }
        });
    }
    public void consumer(int threadNum) {
        executorService = new ThreadPoolExecutor(
                threadNum, threadNum, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000), new ThreadPoolExecutor.CallerRunsPolicy()
        );
        try {
            while (true) {
                ConsumerRecords<K, V> records = consumer.poll(1000);
                if (!records.isEmpty()) {
                    executorService.submit(new ConsumerWork<K, V>(records, offsets));
                }

            }
        } catch (Exception e) {

        } finally {

        }
    }
}

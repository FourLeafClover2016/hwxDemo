package com.hwx.thread.producerConsumer.oneToOne;

/**
 * @author: Huawei Xie
 * @date: 2019/9/15
 */
public class TestMain {
    public static void main(String[] args) {
        ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();
        ProduceThread produceThread = new ProduceThread(producerAndConsumer);
        ConsumerThread consumerThread = new ConsumerThread(producerAndConsumer);
        Thread threadA = new Thread(produceThread);
        Thread threadB = new Thread(consumerThread);
        threadA.start();
        threadB.start();

    }
}

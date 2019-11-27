package com.hwx.thread.producerConsumer.oneToOne;

/**
 * @author: Huawei Xie
 * @date: 2019/9/15
 */
public class ConsumerThread implements Runnable {
    private ProducerAndConsumer producerAndConsumer;

    public ConsumerThread(ProducerAndConsumer producerAndConsumer) {
        this.producerAndConsumer = producerAndConsumer;
    }

    @Override
    public void run() {
        while (true) {
            producerAndConsumer.consumerMethod();
        }
    }
}

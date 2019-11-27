package com.hwx.thread.produceConsumer;

public class Resource {
    private volatile int count = 0;
    public volatile boolean flag = true;
    public synchronized void produce() throws InterruptedException {
        while (!flag) {
            wait();
        }
        count ++;
        notifyAll();
        flag = false;
        System.err.println("生产:" + count);
    }
    public synchronized void consume() throws InterruptedException {
        while (flag) {
            wait();
        }
        notifyAll();
        flag = true;
        System.out.println("消费:" + count);
    }
}

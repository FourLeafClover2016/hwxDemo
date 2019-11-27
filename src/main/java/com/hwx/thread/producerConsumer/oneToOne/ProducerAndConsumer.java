package com.hwx.thread.producerConsumer.oneToOne;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Huawei Xie
 * @date: 2019/9/15
 */
public class ProducerAndConsumer {
    private Lock lock = new ReentrantLock();
    private Condition producerCondition = lock.newCondition();
    private Condition consumerCondition = lock.newCondition();
    private boolean flag = true;
    private int index = 0;

    public void produceMethod() {
        lock.lock();
        try {
            if (!flag) {
                producerCondition.await();
            }
            flag = false;
            index++;
            System.out.println("生产者生产第" + index + "个产品 ++++++++");
            consumerCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consumerMethod() {
        lock.lock();

        try {
            if (flag) {
                consumerCondition.await();
            }
            flag = true;
            System.out.println("消费者消费第" + index + "个产品 ---------");
            producerCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}

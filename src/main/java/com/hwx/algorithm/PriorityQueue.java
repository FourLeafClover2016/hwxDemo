package com.hwx.algorithm;

import java.util.Arrays;

/**
 * 优先队列
 */
public class PriorityQueue {
    private int[] queue;
    private int size = 0;

    public PriorityQueue() {
        queue = new int[3];
    }

    /**
     * 上浮
     */
    public void upAdjust() {
        int childIndex = this.size -1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = this.queue[childIndex];
        while (childIndex > 0 && this.queue[parentIndex] < temp) {
            this.queue[childIndex] = this.queue[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        this.queue[childIndex] = temp;
    }

    /**
     * 下沉
     */
    public void downAdjust() {
        int parentIndex = 0;
        int childIndex = 2 * parentIndex + 1;
        int temp = this.queue[parentIndex];
        while (childIndex < this.size && this.queue[childIndex] > temp) {
            if (childIndex + 1 < this.size && this.queue[childIndex] < this.queue[childIndex + 1]) {
                childIndex++;
            }
            if (temp >= this.queue[childIndex]) {
                break;
            }

            this.queue[parentIndex] = this.queue[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * parentIndex + 1;
        }
        this.queue[parentIndex] = temp;
    }

    /**
     * 入队
     *
     * @param value
     */
    public void put(int value) {
        this.queue[size] = value;
        this.size++;
        upAdjust();
        if (size >= this.queue.length) {
            resize();
        }
    }

    /**
     * 出队
     */
    public int remove() {
        if (this.size <= 0) {
            throw new RuntimeException("queue is empty");
        }
        this.size--;
        int temp = this.queue[0];
        this.queue[0] = this.queue[this.size];
        downAdjust();
        return temp;
    }

    /**
     * 扩容
     */
    public void resize(){
        int newSize = this.size * 2;
        this.queue = Arrays.copyOf(this.queue, newSize);
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.put(3);
        priorityQueue.put(5);
        priorityQueue.put(10);
        priorityQueue.put(2);
        priorityQueue.put(7);

        System.out.println(Arrays.toString(priorityQueue.queue));

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}

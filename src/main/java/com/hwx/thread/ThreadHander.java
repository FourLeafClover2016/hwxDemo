package com.hwx.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadHander {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 30, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(150));
        for (int i = 0; i < 2; i++) {
            threadPoolExecutor.execute(new Task("任务-----" + i));
        }
        threadPoolExecutor.shutdown();
    }
}

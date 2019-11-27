package com.hwx.thread.join;

import java.util.concurrent.TimeUnit;

public class JoinTest implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------over");
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTest joinTest = new JoinTest();
        Thread thread = new Thread(joinTest);
        thread.start();
        thread.join();
        System.out.println("main over");
    }
}

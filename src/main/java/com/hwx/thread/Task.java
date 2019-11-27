package com.hwx.thread;

public class Task implements Runnable{
    private String name;
    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("正在执行线程------" + Thread.currentThread().getName() + "-----任务名------" + name);
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("线程执行完成------" + Thread.currentThread().getName() + "-----任务名------" + name);
        System.out.println();
    }
}

package com.hwx.thread.produceConsumer;

public class Producer implements Runnable {
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.produce();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.hwx.thread.produceConsumer;

public class Consumer implements Runnable {
    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

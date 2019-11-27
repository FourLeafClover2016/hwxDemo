package com.hwx.task;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.ReentrantLock;

@Component
public class Init implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {

        }
    }
}

package com.hwx.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    int i = 0;
    @Scheduled(cron = "* * * * * ?")
    private void task(){
        System.out.println(i++);
    }

}

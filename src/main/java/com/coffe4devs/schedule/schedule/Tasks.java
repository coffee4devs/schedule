package com.coffe4devs.schedule.schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
public class Tasks {

    private final long SECOND = 1000;
    private final long MINUTE = SECOND * 60;

    @Scheduled(fixedDelay = SECOND)
    public void taskSeconds() {
        System.out.println("I'LL RUN EVERY 1 SECOND. LAST RUN ON " + new Date());
    }

    @Scheduled(fixedDelay = MINUTE)
    public void taskMinutes() {
        System.out.println("I'LL RUN EVERY 1 MINUTE. LAST RUN ON " + new Date());
    }

}

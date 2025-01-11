package com.springboot.app;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingService {
    @Scheduled(fixedRate = 1000)
    public void test(){
        System.out.println("hello world");
    }

//    @Scheduled(fixedDelay = 1000)
//    public void testDelay() {
//        try {
//            System.out.println("Sleeping for 2 seconds");
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Hello World");
//    }

//    @Scheduled(initialDelay = 6000, fixedRate = 1000)
//    public void testInitialDelay(){
//        System.out.println("Hello World");
//    }
//
//
//    @Scheduled(cron = "0 0 6 * * MON")
//    public void testCron(){
//        System.out.println("Do something every Monday at 6:00am");
//    }
}

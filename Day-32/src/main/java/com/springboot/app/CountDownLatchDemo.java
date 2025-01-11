package com.springboot.app;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch demo = new CountDownLatch(6);
        for(int i=1;i<=5;i++){
            new Thread(()->{
                System.out.println("Thread--"+Thread.currentThread().getName());
                demo.countDown(); //-1
            },String.valueOf(i)).start();
        }
        demo.await();
        System.out.println("+++++");

    }
}

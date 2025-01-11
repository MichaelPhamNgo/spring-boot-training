package com.springboot.app;

import java.util.concurrent.atomic.AtomicInteger;

public class WaitNotifyExample {
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(1);

        Thread oddThread = new Thread(() -> {
            while(number.get() < 100) {
                synchronized (number) {
                    while (number.get() % 2 == 0) {
                        try {
                            number.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number.set(number.get() + 1);
                    number.notifyAll();
                }
            }
        }, "Odd-Thread");

        Thread evenThread = new Thread(() -> {
            while (number.get() < 100) {
                synchronized (number) {
                    while (number.get() % 2 != 0) {
                        try {
                            number.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number.set(number.get() + 1);
                    number.notifyAll();
                }
            }
        }, "Even-Thread");

        oddThread.start();
        evenThread.start();
    }
}

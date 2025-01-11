package com.springboot.app;

public class JoinExample {

    public static void main(String[] args) {
        System.out.println("Main thread starts");
        Thread thread = new Thread(() -> {
            System.out.println("sleeping for two seconds");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sleep over");
        });
        thread.start();
        try {
            thread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread ends");
    }
}

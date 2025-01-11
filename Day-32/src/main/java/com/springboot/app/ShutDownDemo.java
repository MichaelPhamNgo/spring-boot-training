package com.springboot.app;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutDownDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Runnable> tasks = Arrays.asList(
                () -> {
                    try {
                        String name = "Task1: " + Thread.currentThread().getName();
                        TimeUnit.SECONDS.sleep(4);
                        System.out.println(name);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                },
                () -> {
                    try {
                        String name = "Task2: " + Thread.currentThread().getName();
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println(name);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        tasks.stream().forEach(
                (task) -> executor.submit(task)
        );
        try {
            System.out.println("Attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("Cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("Shutdown finished");
        }
    }
}


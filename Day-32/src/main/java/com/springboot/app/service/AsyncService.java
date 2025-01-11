package com.springboot.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class AsyncService {
    @Async("taskExecutor")
    public CompletableFuture<String> getUser(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("user info");
        return CompletableFuture.completedFuture("User Info");
    }

    @Async("taskExecutor")
    public CompletableFuture<String> getAccount(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture("Account Info");
    }
    @Async("taskExecutor")
    public CompletableFuture<String> getBilling(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture("Billing Info");
    }

    @Async("taskExecutor")
    public CompletableFuture<String> getUsage(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture("Usage Info");
    }
}

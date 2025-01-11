package com.springboot.app.service;

import com.springboot.app.domain.MyAsyncResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MyService {
    @Autowired
    private AsyncService asyncService;

    public MyAsyncResponse asyncCall() {
        CompletableFuture<String> userFuture = asyncService.getUser();
        CompletableFuture<String> accountFuture = asyncService.getAccount();
        CompletableFuture<String> billingFuture = asyncService.getBilling();
        CompletableFuture<String> usageFuture = asyncService.getUsage();



        CompletableFuture<MyAsyncResponse> responseFuture = CompletableFuture.allOf(
                userFuture,
                accountFuture,
                billingFuture,
                usageFuture).thenApply((dummy) -> {
                    return MyAsyncResponse.builder()
                                          .userResponse(userFuture.join())
                                          .accountResponse(accountFuture.join())
                                          .billingResponse(billingFuture.join())
                                          .usageResponse(usageFuture.join())
                                          .build();});
        return responseFuture.join();
    }

}

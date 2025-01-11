package com.springboot.app;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

public class CallableDemo {
//    Runnable

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        demo5();
    }
    private static void shutDown(ExecutorService service){
        try{
            System.out.println("Attempt to shutdown");
            service.shutdown();
            service.awaitTermination(1,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.err.println("XXX Interrupted XXX");
        }finally {
            if(!service.isTerminated()){
                System.err.println("XXX Cancel not finished tasks XXX");
            }
            service.shutdownNow();
            System.out.println("Shutdown finish");
        }
    }

    private static void demo1(){
//        ExecutorService service = Executors.newSingleThreadExecutor();

        ExecutorService service = Executors.newFixedThreadPool(2);
//        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(()-> System.out.println(Thread.currentThread().getName()));
        service.submit(()-> System.out.println(Thread.currentThread().getName()));
        service.submit(()-> System.out.println(Thread.currentThread().getName()));

        service.shutdown();
    }

    private static void demo2() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(()-> "Hi");
        System.out.println(future.get());
        service.shutdown();
    }

    private static void demo3() throws InterruptedException, ExecutionException, TimeoutException {
        List<Callable<String>> list = Arrays.asList(
                ()->{
                    Thread.sleep(1000);
                    return "Task1 "+Thread.currentThread().getName();
                },
                ()->"Task2 "+Thread.currentThread().getName(),
                ()->{
                    Thread.sleep(4000);
                    return "Task3 "+Thread.currentThread().getName();
                },
                ()->{
                    Thread.sleep(2000);
                    return "Task4 "+Thread.currentThread().getName();
                });
        ExecutorService service = Executors.newFixedThreadPool(2);

//      ,4,TimeUnit.SECONDS
//        List<Future<String>> futures = service.invokeAll(list,3,TimeUnit.SECONDS);
//        for(Future<String> future:futures){
//            System.out.println(future.get());
//        }


//        System.out.println(futures.get(0).get());
//        System.out.println(futures.get(1).get());
////        System.out.println(futures.get(2).get());
//        System.out.println(futures.get(3).get());


        String s = service.invokeAny(list);
        System.out.println(s);
//
        service.shutdown();

    }

    private static void demo4() throws InterruptedException, ExecutionException {
        List<Callable<String>> list = Arrays.asList(
                ()->{
                    Thread.sleep(2000);
                    return "User Info";
                },
                ()->{
                    Thread.sleep(4000);
                    return "Account Info";
                },
                ()->{
                    Thread.sleep(1000);
                    return "Billing Info";
                },
                ()->{
                    Thread.sleep(5000);
                    return "Usage Info";
                });
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<String>> futures = service.invokeAll(list,10,TimeUnit.SECONDS);
        for(Future<String> future:futures){
//            future.
            System.out.println(future.get()); //blocked
        }
        System.out.println("Other things I need to do...");
        shutDown(service);
    }

    private static void demo5() throws ExecutionException, InterruptedException {
        Supplier<String> userInfo = ()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "User Info";
        };
        Supplier<String> accountInfo = ()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Account Info";
        };
        Supplier<String> billingInfo = ()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Billing Info";
        };
        Supplier<String> usageInfo = ()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Usage Info";
        };

        ExecutorService service = Executors.newFixedThreadPool(10);

        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(userInfo,service);
        CompletableFuture<String> accountFuture = CompletableFuture.supplyAsync(accountInfo,service);
        CompletableFuture<String> billingFuture = CompletableFuture.supplyAsync(billingInfo,service);
        CompletableFuture<String> usageFuture = CompletableFuture.supplyAsync(usageInfo,service);


        //whenComplete
//        userFuture.whenComplete((t,u)-> {
//            System.out.println(t); //success
//            System.out.println(u); //fail
//        });
//        System.out.println("Other things I need to do...");//non blocked

        //thenApply
//        CompletableFuture<String> resultFuture = userFuture.thenApply(
//                result->result+" Other things I need to do...");
//        System.out.println(resultFuture.join());



        //allOf
//        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(userFuture,accountFuture,billingFuture,usageFuture);
//        combinedFuture.thenRun(() ->  {System.out.println("hello");});
//
//        System.out.println(userFuture.get());
//        System.out.println(accountFuture.get());
//        System.out.println(billingFuture.get());
//        System.out.println(usageFuture.get());


        //use stream
//        String combined = Stream.of(userFuture, accountFuture, billingFuture,usageFuture)
//                                .map((future)->future.join())
////                                .map(CompletableFuture::join)
//                                .collect(Collectors.joining("+"));
////
//        System.out.println(combined);
//        service.shutdown();


        //anyOf
        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(userFuture,accountFuture,billingFuture,usageFuture);
        System.out.println(anyFuture.get());
        service.shutdown();



    }


}

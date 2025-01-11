package com.beaconfire;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean")
public class LifeCycleBean {
    @PostConstruct
    public void init(){
        System.out.println("-------- after the constructor");
    }

    public LifeCycleBean() {
        System.out.println("-------- constructor");
    }

    @PreDestroy
    public void destroy(){

        System.out.println("-------- before destroy");
    }
}

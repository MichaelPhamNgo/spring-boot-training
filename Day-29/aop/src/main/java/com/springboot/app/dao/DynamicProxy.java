package com.springboot.app.dao;

import java.lang.reflect.Proxy;

public class DynamicProxy {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println("before saving data");

                // invoke target object's method
                Object returnValue = method.invoke(target, args);

                System.out.println("after saving data");
                return null;
            });
    }
}

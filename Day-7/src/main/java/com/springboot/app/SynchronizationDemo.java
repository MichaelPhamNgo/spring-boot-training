package com.springboot.app;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizationDemo {
    public static void main(String[] args) {
        foo foo1 = new foo();
        foo foo2 = new foo();
        // locking on the same object
//        new Thread(foo1::bar).start();
//        new Thread(foo1::bar).start();

        // synchronization on an object doesn't work on different instances
//        new Thread(foo1::bar2).start();
//        new Thread(foo2::bar2).start();

        // synchronization on class blocks on all instances
//        new Thread(foo1::bar3).start();
//        new Thread(foo2::bar3).start();

        // reentrantlock
        new Thread(foo1::bar4).start();
        new Thread(foo1::bar4).start();
    }
}

class foo {
    ReentrantLock lock = new ReentrantLock();

    synchronized void bar() {
        System.out.println(Thread.currentThread().getName() + " bar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void bar2() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " bar2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void bar3() {
        synchronized (foo.class) {
            System.out.println(Thread.currentThread().getName() + " bar3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void bar4() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " bar3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}

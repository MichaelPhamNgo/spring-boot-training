public class CreateThreadDemo {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        MyThread myThread = new MyThread();
//        myThread.start();


//        Thread myThread1 = new Thread(new MyRunnableInstance());
//        myThread1.start();
        Thread myThread1 = new Thread(() -> System.out.println("Implement Runnable Interface "+Thread.currentThread().getName()));
        myThread1.start();
        myThread1.run();
        myThread1.run();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread -----> "+Thread.currentThread().getName());
    }
}

class MyRunnableInstance implements Runnable {

    @Override
    public void run() {
        System.out.println("Implement Runnable Interface "+Thread.currentThread().getName());
    }
}

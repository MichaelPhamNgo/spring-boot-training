package com.springboot.app.threadinterference;

public class SynExample {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Thread fan = new Thread(()->{
            for(int i=0;i<100;i++) {
                booking.buy();
            }
        },"Fan");
        Thread landon = new Thread(()->{
            for(int i=0;i<100;i++) {
                booking.buy();
            }
        },"Landon");
        fan.start();
        landon.start();
    }
}
class Booking{
    private int tickets;
    public Booking() {
        this.tickets = 50;
    }
    public void buy() {
        if(tickets<=0)
            return;
        System.out.println(Thread.currentThread().getName()+" bought "+tickets--);
    }

}

package threadinterference;

public class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            Counter counter = new Counter();
            new Thread(counter::increment).start();
            new Thread(counter::decrement).start();
            if(counter.value() != 0) {
                System.out.println("Thread interference happened");
            }
        }
    }
}

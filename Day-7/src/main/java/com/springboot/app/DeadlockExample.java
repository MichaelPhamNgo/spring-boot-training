public class DeadlockExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Key key1 = new Key();
        Key key2 = new Key();

        Thread fan = new Thread(()->{
            synchronized(key1) {
                key1.setAvailable(false);
                System.out.println("fan has key1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized(key2) {
                    key2.setAvailable(false);
                    System.out.println("fan has key2");
                }
            }
        });


        Thread landon = new Thread(()->{
            synchronized(key2) {
                key2.setAvailable(false);
                System.out.println("landon has key2");
                synchronized(key1) {
                    key1.setAvailable(false);
                    System.out.println("landon has key1");
                }
            }
        });

        fan.start();
        landon.start();

    }

}

class Key{
    private boolean available;
    Key(){
        this.available = true;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}

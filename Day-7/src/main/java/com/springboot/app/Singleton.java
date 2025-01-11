public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton () {}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread(() -> System.out.println(Singleton.getInstance())).start();
        new Thread(() -> System.out.println(Singleton.getInstance())).start();
    }
}

package exception;

public class FinallyExample {
    public static int foo() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(foo());
    }
}

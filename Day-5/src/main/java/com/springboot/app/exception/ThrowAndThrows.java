package exception;

public class ThrowAndThrows {
    public static void throwException() throws Exception{
        throw new Exception("some exception");
    }

    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}

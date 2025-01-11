package java8.defaultmethod;

public interface MyInterface {

    default int valueSquared(int value) {
        return value * value;
    }

    static int valueCubed(int value) {
        return value * value * value;
    }
}

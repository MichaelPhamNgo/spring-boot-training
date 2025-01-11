package java8.defaultmethod;

public class MyImplementation implements MyInterface {

//     overriding default behavior
    @Override
    public int valueSquared(int value) {
        return 0;
    }

    public static void main(String[] args) {
//        invoking static method of the interface
        System.out.println(MyInterface.valueCubed(4));

        //invoking default method on implementation instance
        MyImplementation foo = new MyImplementation();
        System.out.println(foo.valueSquared(4));
    }
}

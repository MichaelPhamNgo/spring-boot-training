package java8.defaultmethod.diamondproblem;

public interface B {
    default void foo() {
        System.out.println("B");
    }
}

import java.util.Arrays;

public class ArrayExample {
    public static void foo(int[] array) {
        //do something
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        int[] ints1 = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] ints2 = {3, 1, 4, 1, 5, 9, 2, 6};
        Arrays.sort(ints2);
        for(int n : ints2) {
            System.out.println(n);
        }
    }
}

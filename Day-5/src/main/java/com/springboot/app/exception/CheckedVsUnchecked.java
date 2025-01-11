package exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedVsUnchecked {

    public static void main(String[] args) {
        // checked exception
//        BufferedReader reader = new BufferedReader(new FileReader("buffered-writer.txt"));
//        String line;
//        while((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        reader.close();

        // unchecked exception
        int val = 7 / 0;
    }
}

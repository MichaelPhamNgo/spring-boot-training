package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionOrder {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("buffered-writer.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

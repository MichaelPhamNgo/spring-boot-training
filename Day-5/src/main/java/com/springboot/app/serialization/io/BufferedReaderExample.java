package serialization.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void A() throws Exception {
        B();
    }

    static void B() throws Exception{
        throw new Exception("some exception");
    }


    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("buffered-writer.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // controller, service, dao/data processing layer
        // if you don't want to the user to know exception then handle it in the service layer, middle layer
        // if you want the user to know the exception then
    }
}

package serialization.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("buffered-writer.txt"));
            writer.write("Writing characters to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

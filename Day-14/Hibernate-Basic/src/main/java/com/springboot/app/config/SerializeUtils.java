package com.springboot.app.config;

import java.io.*;

public class SerializeUtils {
    public static void serialization(Object object) {
        try {
            FileOutputStream file = new FileOutputStream("Day-14/src/main/java/file.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
        }
    }

    public static Object deserialization() {
        Object object = null;
        try {
            FileInputStream file = new FileInputStream("Day-14/src/main/java/file.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            object = in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        return object;

    }
}

package com.springboot.app.serialization;

import java.io.*;

public class Serialization {
    public static void serialization(User user) {
        try {
            FileOutputStream file = new FileOutputStream("Day-5/src/main/java/file.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(user);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static User deserialization() {
        User user = null;
        try {
            FileInputStream file = new FileInputStream("Day-5/src/main/java/file.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            user = (User) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        User user = new User("Jack", "123");
        serialization(user);
        User user1 = deserialization();
        System.out.println(user1);
        System.out.println(user == user1);
    }
}

package com.springboot.app.exception;

import java.sql.SQLException;

public class Test {
    String str = "a";

    void A() {
        try {
            str += "b";
            B();
        } catch(Exception e) {
            str += "c";
        }
    }

    void B() throws Exception {
        try {
            str += "d";
            C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            str += "e";
        }
        str += "f";
    }

    void C() throws Exception {
        throw new Exception();
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test object = new Test();
        object.A();
        object.display();
        try {
            throw new SomeException("some exception happened");
        } catch (SomeException e) {
            e.printStackTrace();
        }
        // delete from table where id doesn't not exist
        // trying to insert into a table where the column name does not exist
    }
}

package com.springboot.app.markerinterfaceexample;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MarkerInterfaceDemo {
    public static void main(String[] args) throws IOException {


//        Repository
//        PagingAndSortingRepository



        MyObject object = new MyObject();
        FileOutputStream fileOutputStream
                = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
class MyObject implements  Serializable{
    private Integer id;
    private String name;
}

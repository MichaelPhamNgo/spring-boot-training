package com.springboot.app.markerinterfaceexample;

public class MyMarkerInterfaceClass implements MyMarkerInterface{
    public void someFunction() {
        // It provides run-time type information about objects
        // so the compiler and JVM have additional information about the object
        if(this instanceof MyMarkerInterface){
            // continue execution...
        }else{
            // throw CustomizedException()
        }
    }

    public static void main(String[] args) {
        MyMarkerInterfaceClass clazz = new MyMarkerInterfaceClass();
        clazz.someFunction();
    }
}

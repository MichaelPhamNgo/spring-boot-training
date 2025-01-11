package com.beaconfire;


public class CircularB {
    CircularA a;

    public CircularB() {
        System.out.println("B has been created");
    }

    public void setA(CircularA a) {
        this.a = a;
    }

    public CircularB(CircularA a) {
        this.a = a;
    }

}

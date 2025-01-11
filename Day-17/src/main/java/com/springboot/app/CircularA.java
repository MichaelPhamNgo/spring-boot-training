package com.beaconfire;

public class CircularA {
    CircularB b;

    public CircularA() {
        System.out.println("A has been created");
    }

    public CircularA(CircularB b) {
        this.b = b;
    }

    public void setB(CircularB b) {
        this.b = b;
    }
}

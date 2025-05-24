package com.basics;
interface Bicycle{
    void move();
}
public class Interfaces implements Bicycle {
    public static void main(String[] args) {
        Interfaces obj = new Interfaces();
        obj.move();
    }

    @Override
    public void move() {

    }
}

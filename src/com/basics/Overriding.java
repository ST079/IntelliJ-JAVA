package com.basics;
class A{
    public void method(){
        System.out.println("A");
    }
}
class B extends A{
    @Override // it is necessary because it's a notation that tells if overriding is happening or not
    public void method(){
        System.out.println("B");
    }
}
public class Overriding {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        B O = new B();
        A a = new A();
        a.method();
        O.method();

    }
}

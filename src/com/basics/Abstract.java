package com.basics;
abstract class Parent{
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("child");
    }
}
public class Abstract {
    public static void main(String[] args) {
//        Parent p = new Parent();  -> error
        Child c = new Child();
        c.greet();

    }
}

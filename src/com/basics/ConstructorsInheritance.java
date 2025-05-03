package com.basics;
class Mybase{
    Mybase(){
        System.out.println("Mybase constructor");
    }
    Mybase(int a){
        System.out.println("Mybase constructor" + a);
    }
}

class Foo extends Mybase{
    Foo(){
        super(3);
        System.out.println("Foo constructor");
    }
}
public class ConstructorsInheritance {
    public static void main(String[] args) {
        Foo foo = new Foo();

    }
}

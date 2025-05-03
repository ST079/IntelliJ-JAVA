package com.basics;
class Base{
    int x;

    public int getX() {
        System.out.println("from base");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void me(){
        System.out.println("I am Base");
    }
}

//for inheritance, we use entends keywords
class Derived extends Base{
int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Derived2 extends Base{
    int z;
}


public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());

        Derived2 d2 = new Derived2();
        d2.setX(6);
        System.out.println(d2.getX());

    }
}

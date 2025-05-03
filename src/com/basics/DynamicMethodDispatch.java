package com.basics;
class Phone{
    public void swagat(){
        System.out.println("Good Morning");
        }
    public void on(){
        System.out.println("Turning On phone");
    }
    }
class smartPhone extends Phone{
    public void greet(){
        System.out.println("Good Afternoon");
    }
    @Override
    public void on(){
        System.out.println("Turning On smart phone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("Polymorphism");
//        Phone Phone = new Phone();
        Phone obj = new smartPhone();
        obj.on();
        obj.swagat();
//        obj.greet(); not allowed
    }
}

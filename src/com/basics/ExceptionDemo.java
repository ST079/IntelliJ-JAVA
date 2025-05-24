package com.basics;
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class ExceptionDemo {
    static void validAge(int age)  throws MyException {
        if (age < 18) {
            throw new MyException("Age must be at least 18");
        }
    }
    public static void main(String[] args) {
        int a= 12;
        try{
            validAge(a);
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}

package com.basics;
class MyExp extends Exception {
    public MyExp(String m) {
        super(m);
    }
}

// A Class that uses the above MyException
public class CustomExp {
    public static void main(String args[]) {
        int a = 1;
        int b = 0;
        try {
            if (b == 0) {
                throw new MyExp("This is a custom exception");
                }
            else {
                int result = a/b;
                System.out.println(result);
            }
            }
        catch (MyExp ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
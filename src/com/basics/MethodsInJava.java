package com.basics;

public class MethodsInJava {
    static void greet(){
        System.out.println("Nice to meet you");
    }
    //varargs
    //giving as much argument it needs
    static int sum(int ...arr){
        int res = 0;
        for (int items:arr){
            res += items;
        }
        return res;
    }

    static int foo(int x, int ...arr){
        int res = 0;
        for (int items:arr){
            res += items;
        }
        return res;
    }
    public static void main(String[] args){

        greet();
        System.out.println(sum(1,2,7));
        System.out.println(foo(2,7));
    }
}

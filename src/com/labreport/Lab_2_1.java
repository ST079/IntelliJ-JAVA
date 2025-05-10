package com.labreport;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args){
//        WAP to find the smallest number between 3 entered number using if else statement
        int a,b,c;

        //scanner object
        Scanner input = new Scanner(System.in);

        //taking inputs
        System.out.println(" Number 1: ");
        a = input.nextInt();
        System.out.println(" Number 2: ");
        b = input.nextInt();
        System.out.println(" Number 3: ");
        c = input.nextInt();

        //condition checking
        if(a<b && a<c){
            System.out.println(a+" is the smallest");
        } else if (b<c && b<a) {
            System.out.println(b+" is the smallest");
        } else if (c<a && c<b) {
            System.out.println(c+" is the smallest");
        }else{
            System.out.println("All are equal");
        }
    }
}

package com.labreport;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args){
        int per;
        Scanner input = new Scanner(System.in);
        System.out.println("Provide your percentage (1-100): ");
        per = input.nextInt();
        String grade;

        switch (per / 10) {
            case 10:
                grade ="S";
                break ;
            case 9:
                grade ="A";
                break;
            case 8:
                grade ="B";
                break;
            case 7:
                grade ="C";
                break;
            case 6:
                grade ="D";
                break;
            case 5:
                grade ="E";
            default:
                grade ="F";
        }
        System.out.println("You Scored "+grade+" Grade");
    }
}

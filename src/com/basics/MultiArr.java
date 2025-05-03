package com.basics;
import java.util.Scanner;
public class MultiArr {
    public static void main(String[] args){
        // Search if item is in array or not
        int[] arr = {1,2,3,4,5};
        int search;
        boolean found = false;
        System.out.println("Enter the item you want to search: ");
        Scanner input = new Scanner(System.in);
        search = input.nextInt();
        for(int i=0;i<arr.length - 1 ; i++){
            if(arr[i]==search){
                System.out.println("Search found at position" +" "+ (i+1) );
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Search not found");
        }

    }
}

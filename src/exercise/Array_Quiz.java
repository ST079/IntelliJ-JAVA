package exercise;
/*
WAP to print the element of array in reverse order
 */
public class Array_Quiz {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("array in reverse order");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
//for each loop 
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}

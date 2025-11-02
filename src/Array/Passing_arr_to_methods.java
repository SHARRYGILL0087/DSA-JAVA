package Array;

import java.util.Scanner;

public class Passing_arr_to_methods {
    public static  void change(int[] arr){
        arr[0] = 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        change(arr);

        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

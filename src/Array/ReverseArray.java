package Array;

import java.util.Scanner;

public class ReverseArray {

    public  static  void  reverse(int[] arr){
        int n = arr.length;
        int i = 0 , j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.print("Reversed Array : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
}

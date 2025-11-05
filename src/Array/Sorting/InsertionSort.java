package Array.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public  static  void  print(int[] arr){
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Similar to Bubble Sort
        // Swap adjescent elements
        // There are two parts -> sorted and unsorted
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);

        for(int i = 1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        print(arr);
    }
}

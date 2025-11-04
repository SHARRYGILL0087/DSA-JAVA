package Array.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public  static  void  print(int[] arr){
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Swap adjescent elements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);

        for(int k = 0;k<n-1;k++) {
            boolean isSorted = true;
            // Check is arr is already sorted
            for(int i = 0;i<n-1;i++){
                if(arr[i] > arr[i+1]) {
                    isSorted = false;
                    break;
                }
            }
            if(isSorted) break;
            for (int i = 0; i < n-1-k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}

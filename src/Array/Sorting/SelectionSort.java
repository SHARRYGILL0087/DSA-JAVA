package Array.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public  static  void  print(int[] arr){
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Select smallest ele and  Swap it with first element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);

        for(int i=0;i<n-1;i++){
            int minIdx = i;
            // Find Smallest ele idx
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx!=i){ // if -> Swap occur
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }

        print(arr);
    }
}

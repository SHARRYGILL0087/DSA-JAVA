package Array.Sorting;

import java.util.Scanner;

public class BubbleSortSortDescending {
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

        for(int i=0;i<n-1;i++){
            int swap = 0;
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }

        print(arr);
    }
}

package Array.BinarySearch;

import java.util.Scanner;

public class FirstOccurance {
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

        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int idx = -1;
        int lb = 0 , ub = n-1;
        while (lb<=ub) {
            int mid = (lb+ub)/2;
            if (arr[mid] == target) {
                idx = mid;
                ub = mid-1;
            } else if (arr[mid] < target) {
                lb = mid + 1;
            } else ub = mid -1;
        }

        if(idx!=-1) System.out.println("First Occurance of "+target+" is at "+idx);
        else System.out.println("Ele Not Found");
    }
}

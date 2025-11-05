package Array.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public  static  void  print(int[] arr){
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // For Sorted arr and search algo
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int ans = -1;
        int lb = 0 , ub = n-1;
        while (lb<=ub) {
            int mid = (lb+ub)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                lb = mid + 1;
            } else ub = mid -1;
        }
        if(ans!=-1) System.out.println(arr[ans] + " Found at " + ans);
        else System.out.println("Element not found");
    }
}

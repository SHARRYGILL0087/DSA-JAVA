package Array;

import java.util.Scanner;

public class SearchEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter ele : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target : ");
        int ele = sc.nextInt();
        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==ele ) {
                ans = i;
                break;
            }
        }
        if(ans==-1) System.out.println("Element Not Found ");
        else System.out.println("Element found at index " + ans);
    }
}

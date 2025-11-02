package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum : ");
        int tar = sc.nextInt();
        boolean isFound = false;
        for(int i=0;i<n;i++){
            if(isFound) break;
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j] == tar) {
                    System.out.println("The ans is "+ arr[i] +" "+arr[j]);
                    isFound = true;
                    break;
                }
            }
        }

        if(!isFound) System.out.println("Not Found"); ;

    }
}

package Array;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] brr = {1,2,3,5,6,6};
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] sarr = {"Shamsher","Nonu","Sher","Sharry"};
        for(int i = 0;i<sarr.length;i++){
            System.out.print(sarr[i]+" ");
        }
        System.out.println();
//        System.out.println(brr[3]);
//        brr[3] = 33; // Arr is Mutable
//        System.out.println(brr[3]);
        System.out.print("Enter ele : ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements : ");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Sum of Elements
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("\nThe Sum of ELements are : " + sum);

        // Max of elements
        int max = -1;
        for (int i = 0; i< arr.length; i++){
            if(max< arr[i]) max = arr[i];
        }
        System.out.println("The Max Ele is : " + max);


    }
}

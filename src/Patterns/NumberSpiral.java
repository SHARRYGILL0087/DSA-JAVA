package Patterns;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=(2*n-1);i++){
            for (int j = 1; j <= 2*n-1; j++) {
               int a=i,b=j;
               if(i>n) a = 2*n-i;
               if(j>n) b = 2*n-i;
                System.out.print(Math.min(a,b) + " ");
//                if(j<=n && i<=n) System.out.print(Math.min(i, j) + " ");
//                else if(i>n && j<=n) System.out.print(Math.min(2*n-i , j) + " ");
//                else if(i>n && j>n) System.out.print(Math.min(2*n-i , 2*n-j) + " ");
//                else System.out.print(Math.min(i,(2*n-j)) + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}

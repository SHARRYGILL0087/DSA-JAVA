package Patterns;

import java.util.Scanner;

public class DoubleFlipedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1) {
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
           else {
               for(int j=1;j<=i-1;j++){
                   System.out.print("  ");
                }
               for(int k=1;k<=(n-i+1);k++){
                   System.out.print("* ");
               }
                System.out.println();
            }
        }
    }
}

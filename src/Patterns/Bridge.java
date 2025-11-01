package Patterns;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int nsp = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            if(i>1){
                for(int k=1;k<=nsp;k++){
                    System.out.print("  ");
                }
                nsp+=2;
                for(int j=1;j<=n+1-i;j++){
                    System.out.print("* ");
                }
            }
            else {
                for(int j=1;j<=n-1;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}

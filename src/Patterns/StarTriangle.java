package Patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        // Star Triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // Number Triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Alphabets Triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }

        // 1
        // A B
        // 1 2 3
        // A B C D
        // 1 2 3 4 5

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0) System.out.print(j + " ");
                else System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }
    }
}

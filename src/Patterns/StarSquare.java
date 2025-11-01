package Patterns;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        System.out.println((char)(65 + n)); // A / B
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }

    }
}

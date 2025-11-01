package Patterns;

import java.util.Scanner;

public class StarTriangleVerticallyFlipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(j<=(n-i)) System.out.print("  ");
//                else System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

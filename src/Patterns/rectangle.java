package Patterns;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int m = sc.nextInt();
        System.out.print("Enter columns : ");
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package Patterns;

import java.util.Scanner;

public class NumberTriangleVerticallyFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a = 1;
            for(int j=1;j<=n;j++){
                if(j<=(n-i)) System.out.print("  ");
                else System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}

package Patterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
//        boolean startZero = true;
//        for(int i=1;i<=n;i++){
//            if(i%2!=0) startZero=false;
//            for(int j=1;j<=i;j++){
//               if(!startZero) System.out.print("1"+" ");
//               else System.out.print("0"+" ");
//               startZero = !startZero;
//            }
//            System.out.println();
//        }

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0) System.out.print("1 ");
               else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

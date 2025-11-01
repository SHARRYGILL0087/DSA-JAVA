package Basics;

import java.util.Scanner;

public class fist {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int x = 23;
//        System.out.println("Value of x is "+ x);
//        int y = 64;
//        System.out.println(("Value of y is " + y));
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter radius : ");
//        double r = sc.nextDouble();
//        double area = 3.141592 * r*r;
//        System.out.println("Area of circle is " + area);

        System.out.print("Enter a number :");
        double x = sc.nextDouble(); // 3.4
        int y = (int)x; // 3
        if(x-y==0) {
            System.out.println("It is a integer");
        } else {
            System.out.println("It is not a integer");
        }


    }
}

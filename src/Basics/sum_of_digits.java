package Basics;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int sum = 0;
        if(x<0) x = -x;
        while (x!=0){
            sum += x%10;
            x /= 10;
        }

        System.out.println("Sum of digits of number is " + sum);
    }
}

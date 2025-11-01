package Basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                System.out.println("Not a Prime Number");
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime Number");



    }
}

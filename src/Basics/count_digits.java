package Basics;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int count = 0;
        if(x==0) count++;
        while (x!=0){
            x /= 10;
            count++;
        }
        System.out.println(count);
    }
}

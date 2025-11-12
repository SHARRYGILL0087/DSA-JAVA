package String;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        // count digits without loop
        String s = Integer.toString(a);
        System.out.println(s.length());

    }
}

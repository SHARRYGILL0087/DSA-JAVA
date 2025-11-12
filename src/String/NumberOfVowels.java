package String;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a str : ");
        String str = sc.nextLine();
        int count = 0;
        str = str.toLowerCase(); // to handle uppercase vowels
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) count++;
        }
        System.out.println(count);
    }
}

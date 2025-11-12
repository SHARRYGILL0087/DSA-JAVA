package String;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "SharryGill or Shamsher Singh Gill";
        System.out.println(name);
//        System.out.print("Enter Your Last Name :  ");
//        String lastName = sc.nextLine();
//        System.out.println(lastName);
        int n = name.length();
        System.out.println(n);
        System.out.println(name.charAt(0));
        System.out.println(name.equals("SharryGill or Shamsher Singh Gill"));
        System.out.println(name.contains("Sharry"));
        System.out.println(name.indexOf("Shamsher"));
        System.out.println(name.indexOf("sher"));
        String[] str = name.split(" ");
        for(String ele : str) System.out.println(ele);
        String s = "123213";
        int m = Integer.parseInt(s);
        System.out.println(m);
    }
}

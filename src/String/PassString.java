package String;

import java.util.ArrayList;

public class PassString {
    public static void main(String[] args) {
        String s = "Sharry";
        change(s);
        System.out.println(s);

        ArrayList<String> str = new ArrayList<>();
        str.add("Naruto");
        str.add("Luffy");
        str.add("Ichigo");
        str.add("Tangiro");
        str.add("Urahara");
        str.add("Sasuke Aizen");
        str.add("Madara");

        change2(str);

        System.out.println(str);

    }

    private static void change2(ArrayList<String> str) {
        str.add("Itadory");
    }

    public static  void change(String s){
        s = "SharryGill";
//        System.out.println(s);
    }
}

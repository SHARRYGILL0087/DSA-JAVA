package Recursion;

public class Recursion {
    static int x = 12;
    public static void main(String[] args) {
        x = 10;
        fun();
        int x = 32;
        System.out.println(x);
    }
    public  static  void  fun(){
        System.out.println(x);
    }
}

package Recursion;

public class Basics {
    public  static  void print(int n){
        if(n==0) return;
        System.out.println(n+".)"+"Sharry Gill");
        print(n-1);
        System.out.println(n+".)"+"Sharry Gill");
    }
    public static void main(String[] args) {
        print(10);
    }
}

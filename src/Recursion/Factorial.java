package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int x = 5;
        int ans =  fact(x);
        System.out.println(ans);
    }
    public  static  int fact(int n){
        if(n==1 || n==0) return 1;
        // fact(n) = n*fact(n-1)
        return n*fact(n-1); // 5 * fact(4) -> 4*fact(3) -> 3*fact(2) -> 2*fact(1) -> 1
    }
}

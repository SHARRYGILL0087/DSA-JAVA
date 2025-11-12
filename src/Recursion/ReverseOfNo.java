package Recursion;

public class ReverseOfNo {
    public static void main(String[] args) {
        int n = 4;
        int ans = rev(n,0);
        System.out.println(ans);
    }
    public static  int rev(int n,int r){
        if(n==0) return r;
        return rev(n/10,r*10+n%10);
    }
}

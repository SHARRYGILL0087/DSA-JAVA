package Recursion;

public class HCF {
    public static void main(String[] args) {
        int a = 12;
        int b = 16 ;
        int ans = -1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0) ans = i;
        }
        System.out.println(ans);
    }
}

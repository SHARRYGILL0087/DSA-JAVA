package Recursion;

public class aRaiseTob {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int ans =  power(a,b);
        int ans2 = pow(a,b);
        System.out.println(ans + " " + ans2);
    }

    public  static  int pow(int a , int b){
        if(b==0) return  1;
        // 2^16 = 2^8 * 2^8
        // 2^15 = 2^7 * 2^7 * 2
//        if(b%2==0) return pow(a,b/2)*pow(a,b/2);
//        else return  pow(a,b/2)*pow(a,b/2)*2;
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }

    public  static  int power(int a , int b ){ // Have More No of Calls
        if(b==0) return 1;
        // 2^3 = 2*2^2
        return a*power(a,b-1);
    }


}

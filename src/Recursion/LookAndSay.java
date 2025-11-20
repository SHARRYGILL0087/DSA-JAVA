package Recursion;

public class LookAndSay {
    public static void main(String[] args) {
        String ans =  las(5);
    }

    private static String las(int n) {

        if(n==1) {
            return "1";
        }

        String ans = las(n-1);
        System.out.println(ans);
        String res = "";

        int i = 0;
        int j = 0;
        while (i<ans.length()){
            char ch1 = ans.charAt(i);
            char ch2 = ans.charAt(j);
            if(ch1!=ch2) {
                int len = i-j;
                res+=len;
                res+=ch2;
                j = i;
            }
            i++;
        }
        int len = i-j;
        res+=len;
        res+=ans.charAt(j);

        return res;
    }
}

package String;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static int Subset(String s,String ans,int idx,List<String> str){
        if(idx==s.length()) {
            System.out.print(ans+" ");
            str.add(ans);
            return 1;
        }
        char c = s.charAt(idx);
        return Subset(s,ans+c,idx+1,str) + Subset(s,ans,idx+1,str);

    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> str = new ArrayList<>();
        int ans  =  Subset(s,"",0,str);
        System.out.println(ans);
        System.out.println(str);
    }
}

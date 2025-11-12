package String;

public class ReverseSb {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Monkey D Luffy");
//        str.reverse();
//        System.out.println(str);
        int i =0;
        int j = str.length()-1;
        while (i<=j){
            char t1 = str.charAt(i);
            char t2 = str.charAt(j);
            str.setCharAt(i,t2);
            str.setCharAt(j,t1);
            i++;
            j--;
        }
        System.out.println(str);

    }
}

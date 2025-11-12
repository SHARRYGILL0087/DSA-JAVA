package String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Madam";
        int n = str.length();
        boolean flag = true;
        str =  str.toLowerCase();
        int i =0;
        int j = n-1;
        while (i<=j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1!=ch2) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag) System.out.println("Palindrome");
        else  System.out.println("Not a Palindrome");
    }
}

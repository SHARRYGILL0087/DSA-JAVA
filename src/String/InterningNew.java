package String;

public class InterningNew {
    public static void main(String[] args) {
//        String str = "Sharry";
//        String str2 = "Sharry";
//        System.out.println(str==str2); // true
        String str = new String("Sharry");
        String str2 = new String("Sharry");
        System.out.println(str==str2); // False ->  Compares references (memory locations)
        System.out.println(str.equals(str2)); // True

    }
}

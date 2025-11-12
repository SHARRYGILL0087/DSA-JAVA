package String;

public class Plus {
    public static void main(String[] args) {
        String str = "Monkey";
        String s = " D Luffy"; //
        str += s; // string
        str += 56; // int
        str += 's'; // char
        System.out.println(str);
        System.out.println("Sharry"+10+20); // Sharry1020
        System.out.println(10+20+"Sharry"); // 30Sharry
        // Left to Right add hoga
        System.out.println('S'+"harry");
        System.out.println('A'+4+"SSG");

    }
}

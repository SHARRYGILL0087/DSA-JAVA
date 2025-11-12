package String;

public class StringBuilders {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Sharry");
        StringBuilder sb = new StringBuilder(3); // Giving capacity (16 byDefault)
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("Gill");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
    }
}

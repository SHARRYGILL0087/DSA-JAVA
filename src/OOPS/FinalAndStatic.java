package OOPS;

class Cricketer{
//    final String country = "India"; // Cannot be change
//    final static  String country = "Canada";
    static String country = "NZ"; // Shareable vairable to all objects of this class, can be changed
    int runs;
    String name;
    double avg;
    static void greet(){
        System.out.println("Hello EveryOne");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer.greet();
        Cricketer c1 = new Cricketer();
        c1.country = "India";
        System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
        c2.greet();
        System.out.println(c2.country);
    }
}

package Methods;

public class PassBy_val_reffrence {
    public  static void change(int x){
        x *= 2;
        return;
    }


    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
}

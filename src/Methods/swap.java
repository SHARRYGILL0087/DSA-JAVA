package Methods;

public class swap {
    public  static  void  swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        int a = 10 , b = 8;
        System.out.println("Val of a is : "+a);
        System.out.println("Val of b is : "+b);
//        swap(a,b);
        int temp = a ;
        a = b;
        b = temp;
        System.out.println("After Swap : ");
        System.out.println("Val of a is : "+a);
        System.out.println("Val of b is : "+b);

    }
}

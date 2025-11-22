package OOPS;

public class Constructor {

    public static  class Car {
        int seats;
        String name;
        double length;
        String type;

//        Car(){ // default constructor
//
//        }
        Car(int x,String s,double l){ // default constructor
                seats = x;
                name = s;
                length = l;
        }

        void print(){
            System.out.println(seats + " " + name + " " + length);
        }


    }
    public static void main(String[] args) {
        Car c = new Car(5,"Kia",3.99);
        c.print();
    }
}

package OOPS;

public class PassingObjToMethods {

    public static  class Car {
        int seats;
        String name;
        double length;
        String type;

        void print(){
            System.out.println(seats + " " + name + " " + type);
        }

    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.seats = 5;
        c.name = "Swift";
        c.type = "SUV";

        c.print();
        change(c);
        System.out.println(c.seats);
    }

    private static void change(Car c) { // Pass Reference
        c.seats = 4;
    }
}

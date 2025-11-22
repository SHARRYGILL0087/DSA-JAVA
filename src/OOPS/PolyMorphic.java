package OOPS;

public class PolyMorphic {

    public static  class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }

    public static  class Cat{
        void speak(){
            System.out.println("Meaw Meaw");
        }
    }

    public static  class Lion{
        void speak(){
            System.out.println("GRRRRR");
        }
    }

    public static  class Pikachu{
        void speak(){
            System.out.println("Pika Pika Pikachuuuu");
        }
    }

    public static  class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Human ss = new Human();
        Dog Tommy = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Pikachu Pika = new Pikachu();

        ss.speak();
        Tommy.speak();
        c.speak();
        l.speak();
        Pika.speak();



    }
}

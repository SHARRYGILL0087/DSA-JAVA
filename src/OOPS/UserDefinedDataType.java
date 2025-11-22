package OOPS;

public class UserDefinedDataType {

    public static class Student{ // Khud da data type
        String name;
        int rno;
        double cgpa;

        void print(){
            System.out.println(name+ " "+ rno + " "+ cgpa);
        }

    }

    public static void main(String[] args) {

        Student s1 = new Student(); // declaration
        s1.name = "Sharry";
        s1.rno = 11;
        s1.cgpa = 9.2;

        Student s2 = new Student();
        s2.name = "Kize";
        s2.rno = 10;
        s2.cgpa = 9.3;

        Student s3 = new Student();
        s3.name = "Khushi";
        s3.rno = 9;
        s3.cgpa = 8.9;

//        System.out.println(s2.cgpa);
        s1.print();
        s2.print();
        s3.print();

    }
}

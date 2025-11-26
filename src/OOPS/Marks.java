package OOPS;

public class Marks {

    public static  class  StudentData{
        String name;
        int rno;
        int[] marks;

        StudentData(String name , int s){
            this.name = name;
            marks = new int[s];
        }

//        StudentData(String str , int s){
//            name = str;
//            marks = new int[s];
//        }

        void print(){
            System.out.println(name + " " );
        }

    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData("Sharry" , 4);
        StudentData s2 = new StudentData("Harry",2);
        s1.marks[0] = 23;
        s1.marks[1] = 12;
        s1.marks[3] = 9;
//        s2.marks[2] = 32; // Out of index
        s1.print();
        final int x = 23;
//        x = 32; // Cannot be change
    }
}

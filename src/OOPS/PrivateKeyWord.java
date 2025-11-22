package OOPS;

class Students {
    String name; // Null -> Default
    private int rno = 11; // 11
    double cgpa; // 0.0

    private void p(){
        System.out.println(name + " " + rno + " " + cgpa);
    }

    void print(){ // By Default Public
        p();
    }

    void getRno(){ // getter
        System.out.println(rno);
    }

    void setRno(int x){ // setter
        rno = x;
    }

}

public class PrivateKeyWord {

    public static void main(String[] args) {
            Students s1 = new Students();
            s1.name = "Sharry";
            s1.cgpa = 9.5;
//            s1.rno = 23; // Not Allowed
//        s1.print();
        s1.setRno(21);
        s1.getRno();
    }

}

package OOPS;

class ComplexNo{
    int x;
    int y;
    ComplexNo(int x,int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println(x+" + i"+y);
    }

    ComplexNo add(ComplexNo c2){
        ComplexNo c3 = new ComplexNo(this.x+c2.x , this.y+c2.y);
        return c3;
    }

    ComplexNo multi(ComplexNo c2){
        ComplexNo c3 = new ComplexNo(this.x*c2.x-this.y*c2.y , this.x*c2.y + this.y*c2.x);
        return c3;
    }

}

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo(2,5); // 2 + i5
        ComplexNo c2 = new ComplexNo(3,6);
        ComplexNo c3 = c1.add(c2);
        ComplexNo c4 = c1.multi(c2);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}

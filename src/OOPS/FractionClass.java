package OOPS;

class Fraction{
    int num;
    int deno;
    Fraction(int num,int deno){
        this.num = num;
        this.deno = deno;
        simplify();
    }

    void add(Fraction f2){
        this.num  = this.num*f2.deno + f2.num*this.deno;
        this.deno = this.deno * f2.deno;
        simplify();
    }

    void multiply(Fraction f2){
        this.num *= f2.num;
        this.deno *= f2.deno;
        simplify();
    }

    void simplify(){
        boolean isNegative = (num*deno < 0) ? true : false;
        num = Math.abs(num);
        deno = Math.abs(deno);
        int gcd = hcf(this.num,this.deno);
        this.num = num/gcd;
        this.deno = deno/gcd;
        if(isNegative) num = -num;
    }

    int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }


    void print(){
        System.out.println(this.num+"/"+this.deno);
    }


}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f = new Fraction(10,25);
        f.print();
        Fraction f2 = new Fraction(3,7);
        f.add(f2); f.print();
        f.multiply(f2); f.print();

    }
}

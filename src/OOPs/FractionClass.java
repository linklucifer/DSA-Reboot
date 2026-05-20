package OOPs;

class Fraction {
    int num;
    int deno;

    Fraction(int num, int deno){
        this.num = num;
        this.deno = deno;
        simplify();
    }

    void print(){
        System.out.println(num + "/" + deno);
    }

//    addition of fraction
    void add(Fraction f){
        this.num = this.num * f.deno + deno * f.num;
        this.deno = this.deno * f.deno;
        simplify();
    }

//    subtraction of fraction
    void multiplication(Fraction f){
        this.num = this.num * f.num;
        this.deno = this.deno * f.deno;
        simplify();
    }

//    division of fraction
    void division(Fraction f){
        this.num = this.num * f.deno;
        this.deno = this.deno * f.num;
    }

//    if the multiplication become 21/21 then the output should be 1 not 21/21
    void simplify(){
//        handling the negatives if there's any
        boolean isNegative = (num * deno < 0 ) ? true : false;
        num = Math.abs(num);
        deno = Math.abs(deno);
        int gcd = hcf(num, deno);
        num = num / gcd;
        deno = deno / gcd;
        if (isNegative) num = -num;
    }

    int hcf(int a, int b){
        if (a == 0){
            return b;
        }
        return hcf(b % a, a);
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, -7);
        Fraction f2 = new Fraction(7, 3);
//        System.out.println("Numbers before addition:");
        System.out.println("Numbers before multiplication:");
//        System.out.println("Numbers before Division:");
        f1.print();
        f2.print();
//        System.out.println("Numbers after addition:");
        System.out.println("Numbers after multiplication:");
//        System.out.println("Numbers after Division:");
//        f1.add(f2);
        f1.multiplication(f2);
//        f1.division(f2);
        f1.print();

        System.out.println("Simplified Input because if I pass a is 50 and b is 100 then automatically the simplest form will be 1/2 ");
        Fraction f3 = new Fraction(-50, -100);
        f3.print();
    }
}

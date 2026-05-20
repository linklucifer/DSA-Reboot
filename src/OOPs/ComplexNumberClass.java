package OOPs;

class ComplexNumber {
    double x;
    double y;

    ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    default constructor
    ComplexNumber(){

    }

    void print() {
        if (y >= 0) {
            System.out.println(x + " + " + y + "i");
        } else {
            System.out.println(x + " - " + (-y) + "i");
        }
    }

    void add(ComplexNumber z) {
        this.x += z.x;
        this.y += z.y;
    }

//    z1 x z2 = (x1x2 - y1y1) + i(x1y2 + x2y1)
    void multiply(ComplexNumber z){
        double real = this.x;
        double imaginary = this.y;

        this.x = real * z.x - imaginary * z.y;
        this.y = real * z.y + imaginary * z.x;
    }

//    division of two complex numbersL z1/z2
    void divide(ComplexNumber z){
        double real = this.x;
        double imaginary = this.y;

        double denominator = z.x * z.x + z.y * z.y;
        this.x = (real * z.x + imaginary * z.y) / denominator;
        this.y = (imaginary * z.x - real * z.y) / denominator;
    }
}


public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(3, 4);

        System.out.println("Original NumbersL ");
        z1.print();
        z2.print();

//        addition of two complex numbers
        z1.add(z2);
        System.out.println("\nAfter Addition:");
        z1.print();

//        multiplication of two complex numbers
        z2.multiply(z1);
        System.out.println("\nAfter Multiplication:");
        z2.print();

//        division of two complex numbers
        z1.divide(z2);
        System.out.println("\nAfter Division:");
        z1.print();
    }
}

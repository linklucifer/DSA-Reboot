package OOPs;

// Constructor Overloading is a concept where two or methods can have same name but different parameters or different order of parameters

public class Constructors2 {
    public static class Car {
        int price;
        String name;

        Car(){   // default constructor

        }

        Car(int x, String s){   // parameterized constructor
            price = x;
            name = s;
        }

        Car(String s, int x){  // constructor overloading(Method order matters)4
            name = s;
            price = x;
        }

        void print(){
            System.out.println(price + " " + name);
        }
    }

    public static void main(String[] args) {
//        Parameterized Constructor
        Car c1 = new Car(110000, "Bolero");
        c1.print();

//        Constructor Overloading
        Car c2 = new Car("Alto 800", 450000 );
        c2.print();

//        Default Constructor
        Car c3 = new Car();
    }
}

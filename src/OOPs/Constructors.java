package OOPs;

// In Object-Oriented Programming (OOP), a constructor is a special type of method used to initialize objects.
// It is automatically called when you create (instantiate) a new object from a class. Its primary purpose is to set initial
// values for an object's properties or allocate necessary resources

public class Constructors {
    public static class Car {
        int seats;
        String name;
        double length;

        Car(){  // default constructor

        }

        Car(int x, String s, double d){  // parameterized constructor
            seats = x;
            name = s;
            length = d;
        }

        void print(){
            System.out.println(seats + " " + name + " " + length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5, "Kia Sonet", 3.99);
        c1.print();

        Car c2 = new Car(5, "Bolero", 4.45);
        c2.print();

        Car c3 = new Car(4, "Lord Alto", 3.75);
        c3.print();

        Car c4 = new Car();  // in this case default constructor will came in picture
    }
}

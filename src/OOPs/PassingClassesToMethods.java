package OOPs;

public class PassingClassesToMethods {
//    we can use this Car data-type in other files inside the same package too. And if we write this class outside of the parent class then we can
//    directly access this data-type
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats + " " + name + " " + length + "m " + type + " " + torque + "nm");
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

//        if we pass an object in a function/method it is a pass by reference
        change(c);   // it will change the value from 5 to 4
        System.out.println(c.seats);

        c.print();
    }

//    if we pass a car, it will receive a car
    public static void change(Car c){
        c.seats = 4;
    }
}

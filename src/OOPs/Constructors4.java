package OOPs;

// This keyword

public class Constructors4 {
    public static class Car {
        int price;
        String name;

        Car(){

        }

//        to get the variable with the same name we use this keyword
        Car(int price, String name){
            this.price = price;
            this.name = name;
        }

        Car(String s, int x){
            name = s;
            price = x;
        }

        void print(){
            System.out.println(price + " " + name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(450000, "Alto 800");
        c1.print();

        Car c2 = new Car("Bolero", 90000);
        c2.print();
    }
}

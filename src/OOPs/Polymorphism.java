package OOPs;

public class Polymorphism {

//    Polymorphism means many forms. Polymorphism is the ability of different objects to respond to the same command in their own unique way
//    here, speak() is the command for all the species, but it responds differently on each call.

    public static class Dog {
        void speak(){
            System.out.println("Bhaaw Bhaaw");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }

    public static class Lion{
        void speak(){
            System.out.println("Grrrrrrr");
        }
    }

    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat c = new Cat();
        Human haldiram = new Human();
        Pikachu p = new Pikachu();

        tommy.speak();
        c.speak();
        haldiram.speak();
        p.speak();
    }
}

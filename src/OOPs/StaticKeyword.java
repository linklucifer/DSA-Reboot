package OOPs;

class Player {
//    Only ONE shared copy exists for the whole class.
    static String country = "NZ"; // it is a sharable variable and can be shared anywhere in
    int runs;
    String name;
    double avg;

    void print(){
        System.out.println(runs + " " + name + " " + avg);
    }

    static void greet(){
        System.out.println("I only believe in India Win celebration");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
//        even if we won't create an object, still we access the static method in a static method
        Player.greet();
        System.out.println(Player.country);
    }
}

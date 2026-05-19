package OOPs;

class PokemonGame{
    private int power;
    String type;

    PokemonGame(String type, int power){   // basically it is a getter, because it helps us to access and print the private value outside this scope
        this.type = type;
        this.power = power;
    }

    void print(){
        System.out.println(this.type + " " + this.power);
    }
}

public class RevisionOOPS {
    private static class Pokemon{
        int hp;
        int speed;
        int attack;
        int defense;
        String type;
        String name;

//        It is a default constructor. If anything not works then it will automatically run
        Pokemon(){

        }

//        instead of taking different variable name, we will use (this) keyword and access it with the same name
        Pokemon(String type, String name, int attack){
            this.type = type;
            this.name = name;
            this.attack = attack;
        }

        void print(){
            System.out.println(name + " " + type + " " + attack);
        }
    }

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();   // it is accessing the default constructor despite having a parameterized constructor
        p1.name = "Pikachu";
        p1.type = "Electric";
        p1.attack = 70;
        p1.print();

        Pokemon p2 = new Pokemon();
        p2.name = "Charizard";
        p2.type = "Fire";
        p2.attack = 110;
        p2.print();

        Pokemon p3 = p1;  // p3 is a shallow copy of p1(can control)
        p3.type = "Water";
        System.out.println(p1.type);

//        private keyword stuff
        PokemonGame pikachu = new PokemonGame("Electric", 70);
        pikachu.type = "Fire";
//        pikachu.power = 34;  // due to private we cannot access it and that's why it will give an error
        PokemonGame jigglypuff = new PokemonGame("Fairy", 58);
        pikachu.print();
        jigglypuff.print();
    }
}

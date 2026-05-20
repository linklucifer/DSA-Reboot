package OOPs;

// but this class cannot access the ability property from the LegendaryPokemo class
class Pokemon {
    int power;
    String type;

    Pokemon(String type, int power) {
        this.power = power;
        this.type = type;
    }

    Pokemon(){

    }

    void print() {
        System.out.println(this.power + " " + this.type);
    }
}

// this StrongPokemon class is extension of Pokemon class, in which it has all the Pokemon properties, and it has also its own new properties
// and, we can access the properties like power and type without explictly writing in this class. This is called Inheritance
class StrongPokemon extends Pokemon {  // child class
    int speed;
}

class LegendaryPokemon extends Pokemon {  // child class
    String ability;
}
class GodPokemon extends LegendaryPokemon {  // this class will inherit the properties of Pokemon and LegendaryPokemon
    char tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        System.out.println(mewtwo.ability);

//        this inheritance have all the properties of all the class from which it has extended and we can access
        GodPokemon dialga = new GodPokemon();
        dialga.type = "Powerful";
        System.out.println(dialga.type);
    }
}

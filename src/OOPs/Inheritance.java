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

// this LegendaryPokemon class is extension of Pokemon class, in which it has all the Pokemon properties, and it has also its own new properties
// and we can access the properties like power and type without explictly writing in this class. This is called Inheritance
class LegendaryPokemon extends Pokemon {
    String ability;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        System.out.println(mewtwo.ability);
    }
}

package OOPs;

// this is called multi-level inheritance
class Vehicle {
    int wheels;
    int speed;
    int seats;
}

class PowerVehicle extends Vehicle {
    int engine;
}

class AirCraft extends PowerVehicle {
    int rotors;
}

// Hierarchical Inheritance: Here we inherit the properties from the parent class only
class Animal {
    int size;
    boolean isVegetarian;
}

class Birds extends Animal {
    int maximumAltitude;
}

class AquaticAnimals extends Animal {
    int fins;
}

public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();

    }
}

// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class from Animal
class Mammal extends Animal {
    boolean hasFur;

    Mammal(String name, boolean hasFur) {
        super(name); // Call the constructor of the base class (Animal)
        this.hasFur = hasFur;
    }

    void giveBirth() {
        System.out.println(name + " gives birth to live young.");
    }
}

// Derived class from Mammal
class Dog extends Mammal {
    String breed;

    Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur); // Call the constructor of the parent class (Mammal)
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to test the multi-level inheritance
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", true, "Golden Retriever");

        myDog.eat();       // Inherited from Animal
        myDog.giveBirth(); // Inherited from Mammal
        myDog.bark();      // Method of Dog class

        System.out.println("Dog name: " + myDog.name);
        System.out.println("Has fur: " + myDog.hasFur);
        System.out.println("Breed: " + myDog.breed);
    }
}

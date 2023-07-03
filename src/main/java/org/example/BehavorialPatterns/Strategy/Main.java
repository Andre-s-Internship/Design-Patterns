package org.example.BehavorialPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Goofy", 8.5);
        Dolphin dolphin = new Dolphin("Dolphin", 125.5);

        dog.makeSound();
        dog.trySwim();
        dolphin.trySwim();
    }
}

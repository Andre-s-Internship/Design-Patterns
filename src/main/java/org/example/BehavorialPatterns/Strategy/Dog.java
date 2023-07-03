package org.example.BehavorialPatterns.Strategy;

public class Dog extends Animal{

    Dog (String name, double weight) {
        super(name, weight);
        setSwimType(new CantSwim());
        setSound("Bark");
    }

    public void makeSound() {
        System.out.println("Barking");
    }

}
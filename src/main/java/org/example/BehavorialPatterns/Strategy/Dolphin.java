package org.example.BehavorialPatterns.Strategy;

public class Dolphin extends Animal{

    Dolphin (String name, double weight) {
        super(name, weight);
        setSwimType(new CanSwim());
    }

}
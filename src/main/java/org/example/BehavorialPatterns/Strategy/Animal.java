package org.example.BehavorialPatterns.Strategy;

public class Animal {

    private String name;
    private double weight;
    private String sound;
    private Swim swimType;

    Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void trySwim() {
        swimType.swim();
    }

    void setSwimType(Swim swimType) {
        this.swimType = swimType;
    }

    public void makeSound(String sound) {
        System.out.println(sound);
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
package org.example.CreationalPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Dog dog = new Dog();
        Dog dogClone = (Dog) animalMaker.getClone(dog);
        System.out.println(dog.hashCode());
        System.out.println(dogClone.hashCode());
    }
}

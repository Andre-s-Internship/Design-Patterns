package org.example.BehavorialPatterns.Template;

public class NormalHogie extends Hoagie {
    @Override
    boolean customerWantsMeat() {
        return true;
    }

    @Override
    boolean customerWantsCheese() {
        return true;
    }

    @Override
    boolean customerWantsVeggies() {
        return true;
    }

    @Override
    void addMeat() {
        System.out.println("Meat added");
    }

    @Override
    void addCheese() {
        System.out.println("Cheese added");
    }

    @Override
    void addVeggies() {
        System.out.println("Vegetables added");
    }
}

package org.example.BehavorialPatterns.Template;

public class VeggieHoagie extends Hoagie {

    @Override
    boolean customerWantsMeat() { return false;}

    boolean customerWantsCheese() { return true;}


    @Override
    void addCheese() {
        System.out.println("Cheese added");
    }

    @Override
    void addVeggies() {
        System.out.println("Vegetables added");
    }


    @Override
    void addMeat() {}
}

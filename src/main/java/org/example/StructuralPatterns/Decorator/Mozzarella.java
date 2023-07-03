package org.example.StructuralPatterns.Decorator;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding TomatoSauce");

    }

    public String getDescription() {
        return pizza.getDescription() + ", Mozzarella";
    }

    public double getCost() {
        return pizza.getCost() + 0.50;
    }
}

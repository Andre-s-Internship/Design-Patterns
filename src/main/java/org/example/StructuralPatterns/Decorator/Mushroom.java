package org.example.StructuralPatterns.Decorator;

public class Mushroom extends ToppingDecorator{
    public Mushroom(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding mushroom");

    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    public double getCost() {
        return pizza.getCost() + 0.70;
    }
}

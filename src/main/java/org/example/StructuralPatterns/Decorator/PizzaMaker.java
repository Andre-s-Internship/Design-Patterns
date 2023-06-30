package org.example.StructuralPatterns.Decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new Mushroom(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.getDescription() + " which costs $ " + pizza.getCost());
    }
}

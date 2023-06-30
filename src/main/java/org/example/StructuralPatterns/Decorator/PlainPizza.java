package org.example.StructuralPatterns.Decorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}

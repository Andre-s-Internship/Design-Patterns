package org.example.BehavorialPatterns.Strategy;

public interface Swim {
    void swim();
}

class CanSwim implements Swim{

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}


class CantSwim implements Swim{

    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}


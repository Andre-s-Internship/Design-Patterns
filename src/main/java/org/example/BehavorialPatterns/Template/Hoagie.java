package org.example.BehavorialPatterns.Template;

public abstract class Hoagie {

    final void makeSandwich() {
        System.out.println("Sandwich is being made");
        cutBun();
        if(customerWantsMeat()) {
            addMeat();
        }
        if(customerWantsCheese()){
            addCheese();
        }
        if(customerWantsVeggies()){
            addVeggies();
        }
    }
    public void cutBun(){
        System.out.println("The Hoagie is Cut");
    }


    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeggies();
    boolean customerWantsMeat() {
        return true;
    }
    boolean customerWantsCheese(){
        return true;
    }
    boolean customerWantsVeggies() {
        return true;
    }
}

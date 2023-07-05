package org.example.StructuralPatterns;

public class ATMMachineProxy implements ATMData{
    private ATMMachine atmMachine;

    public ATMMachineProxy() {
        atmMachine = new ATMMachine();
    }


    @Override
    public int getCashAmount() {
        return atmMachine.getCashAmount();
    }
}

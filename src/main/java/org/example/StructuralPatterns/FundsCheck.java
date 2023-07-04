package org.example.StructuralPatterns;

public class FundsCheck {
    private double currentBalance;

    public FundsCheck() {
        this.currentBalance = 0;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public boolean validateFunds(double amount) {
        return currentBalance >= amount;
    }

}

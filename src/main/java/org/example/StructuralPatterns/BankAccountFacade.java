package org.example.StructuralPatterns;

public class BankAccountFacade {

    private FundsCheck fundsCheck;
    private PasswordCheck passwordCheck;

    public void withdraw(double amount, int password) {
        if(fundsCheck.validateFunds(amount) && passwordCheck.validatePassword(password)) {
            System.out.println("Withdrawal is done");
        } else {
            System.out.println("Invalid credentials");
        }
    }

}

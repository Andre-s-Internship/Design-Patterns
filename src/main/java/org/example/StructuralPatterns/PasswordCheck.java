package org.example.StructuralPatterns;

public class PasswordCheck {
    public static final int PASSWORD = 1234;

    public boolean validatePassword(int pass) {
        return PASSWORD == pass;
    }
}

package org.example.CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
                .name("Ben")
                .email("ben32@gmail.com")
                .age(32)
                .build();
    }
}

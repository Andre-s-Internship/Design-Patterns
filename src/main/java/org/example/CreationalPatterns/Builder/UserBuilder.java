package org.example.CreationalPatterns.Builder;


public class UserBuilder {
    private String name;
    private int age;
    private String email;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        return new User(name, age, email);
    }



}

package org.example.CreationalPatterns.Prototype;

public class Dog implements Animal {

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Dog is being cloned");
        Dog dog = null;
        try {
            dog = (Dog) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("exception occurred");
        }
        return dog;
    }

}

package org.example.CreationalPatterns.Prototype;

public class CloneFactory {

    public Animal getClone(Animal animal) {
        return animal.makeCopy();
    }
}

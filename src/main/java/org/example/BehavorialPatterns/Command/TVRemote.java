package org.example.BehavorialPatterns.Command;

public class TVRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }

}

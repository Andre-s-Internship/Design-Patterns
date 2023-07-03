package org.example.CreationalPatterns.Factory;

public class CarFactoryMain {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car firstCar = carFactory.createCar("Sedan");
        Car secondCar = carFactory.createCar("SUV");
        firstCar.drive();
        secondCar.drive();
    }
}

package org.example.CreationalPatterns.Factory;

public class CarFactory {
    public Car createCar(String carType) {
        if(carType.equals("Sedan")) {
            return new SedanCar();
        } else if(carType.equals("SUV")) {
            return new SUVCar();
        } else return null;
    }
}

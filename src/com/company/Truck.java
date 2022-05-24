package com.company;

public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовой машины. ");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовой машины. ");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовой машины. ");
    }
}

package com.company;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины.");
    }
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины. ");
    }
}
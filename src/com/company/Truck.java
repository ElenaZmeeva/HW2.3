package com.company;

public class Truck extends Vehicle implements Service {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовой машины. ");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовой машины. ");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовой машины. ");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

}

package com.company;

public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Car car) {
        checkVehicle(car);
            car.checkEngine();
        }


    @Override
    public void check(Truck truck) {
    checkVehicle(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }


    @Override
    public void check(Bicycle bicycle) {
        checkVehicle(bicycle);
    }

    private void checkVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем "  + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        }
    }
}

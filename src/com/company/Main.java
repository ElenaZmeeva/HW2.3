package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Vehicle car2 =  new Car("car2",4);

        Vehicle truck = new Truck("truck1",6);
        Vehicle truck2 = new Truck("truck2",8);

        Vehicle bicycle = new Bicycle("bicycle1",2);
        Vehicle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check((Car) car);
        serviceStation.check((Car) car2);
        serviceStation.check((Truck) truck);
        serviceStation.check((Truck) truck2);
        serviceStation.check((Bicycle) bicycle);
        serviceStation.check((Bicycle) bicycle2);
    }
    }


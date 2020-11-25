package com.syntax.class27;

import java.util.logging.SocketHandler;

public class VehicleTester {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle();
        //Car car = new Car(); abstract class cannot create objects
        Vehicle tesla = new Tesla("Red", "x", "tesla");
        tesla.start();
        tesla.drive();
        tesla.brake();
        tesla.stop();
        System.out.println("Number of vehicles created "+Vehicle.totalVehicle);

        new Toyota("Yellow", "Camry", "Toyota");
        System.out.println("Number of vehicles created "+Vehicle.totalVehicle);
    }
}

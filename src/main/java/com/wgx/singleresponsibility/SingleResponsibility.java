package com.wgx.singleresponsibility;

/**
 * @author wgx
 * @since 2023/4/10 17:04
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plane");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is flying...");
    }
}

package javaEssential.homework.hw3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle plane = new Plane("Kharkiv", 60000, 870, 2008, 3000, 200);
        Vehicle ship = new Ship("Simferopol", 95000, 200, 2016, 170, "Port");
        Vehicle car = new Car("Kyiv", 5350.5, 170, 2012);
        vehicles.add(plane);
        vehicles.add(ship);
        vehicles.add(car);
        for (Vehicle v : vehicles) {
            v.getInfo();
            System.out.println();
        }
    }
}

package javaEssential.homework.hw3.task3;

public class Ship extends Vehicle{
    private int numberOfPassengers;
    private String portOfRegistry;

    public Ship(String coordinates, double price, int speed, int yearOfManufacture, int numberOfPassengers, String portOfRegistry) {
        super(coordinates, price, speed, yearOfManufacture);
        this.numberOfPassengers = numberOfPassengers;
        this.portOfRegistry = portOfRegistry;
    }

    @Override
    public void getInfo() {
        System.out.print("Ship: ");
        super.getInfo();
        System.out.print(", numberOfPassengers = " + numberOfPassengers + ", portOfRegistry = " + portOfRegistry);
    }
}

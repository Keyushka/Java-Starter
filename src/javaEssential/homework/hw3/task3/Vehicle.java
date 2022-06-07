package javaEssential.homework.hw3.task3;

public class Vehicle {
    private String coordinates;
    private double price;
    private int speed;
    private int yearOfManufacture;

    public Vehicle() {}

    public Vehicle(String coordinates, double price, int speed, int yearOfManufacture) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void getInfo() {
        System.out.print("coordinates = " + coordinates + ", price = " + price + ", speed = " + speed +
                ", yearOfManufacture = " + yearOfManufacture);
    }
}

package javaEssential.homework.hw3.task3;

public class Plane extends Vehicle{
    private int height;
    private int numberOfPassengers;

    public Plane(String coordinates, double price, int speed, int yearOfManufacture, int height, int numberOfPassengers) {
        super(coordinates, price, speed, yearOfManufacture);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void getInfo() {
        System.out.print("Plane: ");
        super.getInfo();
        System.out.print(", height = " + height + ", numberOfPassengers = " + numberOfPassengers);
    }
}

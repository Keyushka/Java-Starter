package javaEssential.homework.hw3.task3;

public class Car extends Vehicle{

    public Car(String coordinates, double price, int speed, int yearOfManufacture) {
        super(coordinates, price, speed, yearOfManufacture);
    }

    @Override
    public void getInfo() {
        System.out.print("Car: ");
        super.getInfo();
    }
}

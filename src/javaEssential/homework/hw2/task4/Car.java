package javaEssential.homework.hw2.task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(3, 150.5, 1700, "red");
    }

    public Car(int year) {
        this(year, 160.7, 1800, "black");
    }

    public Car(int year, double speed) {
        this(year, speed, 1650, "blue");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "grey");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return  "year = " + year +
                ", speed = " + speed +
                ", weight = " + weight +
                ", color = " + color;
    }
}

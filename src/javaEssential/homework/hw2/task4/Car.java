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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

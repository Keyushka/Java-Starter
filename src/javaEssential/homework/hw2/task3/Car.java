package javaEssential.homework.hw2.task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 3;
        this.speed = 150.5;
        this.weight = 1700;
        this.color = "red";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 160.7;
        this.weight = 1800;
        this.color = "black";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1650;
        this.color = "blue";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "grey";
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

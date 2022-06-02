package javaEssential.homework.hw2.task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(8);
        Car car3 = new Car(5, 174.3);
        Car car4 = new Car(7, 155, 1689);
        Car car5 = new Car(2, 188.7, 1790, "orange");

        System.out.println("Car1: " + car1);
        System.out.println("Car2: " + car2);
        System.out.println("Car3: " + car3);
        System.out.println("Car4: " + car4);
        System.out.println("Car5: " + car5);
    }
}

package javaEssential.homework.hw2.task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(8);
        Car car3 = new Car(5, 174.3);
        Car car4 = new Car(7, 155, 1689);
        Car car5 = new Car(2, 188.7, 1790, "orange");

        System.out.println("Year: " + car1.getYear() + "; Speed: " + car1.getSpeed() + "; Weight: " + car1.getWeight() + "; Color: " + car1.getColor());
        System.out.println("Year: " + car2.getYear() + "; Speed: " + car2.getSpeed() + "; Weight: " + car2.getWeight() + "; Color: " + car2.getColor());
        System.out.println("Year: " + car3.getYear() + "; Speed: " + car3.getSpeed() + "; Weight: " + car3.getWeight() + "; Color: " + car3.getColor());
        System.out.println("Year: " + car4.getYear() + "; Speed: " + car4.getSpeed() + "; Weight: " + car4.getWeight() + "; Color: " + car4.getColor());
        System.out.println("Year: " + car5.getYear() + "; Speed: " + car5.getSpeed() + "; Weight: " + car5.getWeight() + "; Color: " + car5.getColor());
    }
}

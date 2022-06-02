package javaEssential.homework.hw2.task3;

// Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
// Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я. Перегрузить конструкторы.
// Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(4);
        Car car3 = new Car(2, 175.7);
        Car car4 = new Car(6, 140.3, 1780);
        Car car5 = new Car(1, 195, 1560, "yellow");

        System.out.println("Car1: year = " + car1.getYear() + "; speed = " + car1.getSpeed() + "; weight = " + car1.getWeight() + "; color = " + car1.getColor());
        System.out.println("Car2: year = " + car2.getYear() + "; speed = " + car2.getSpeed() + "; weight = " + car2.getWeight() + "; color = " + car2.getColor());
        System.out.println("Car3: year = " + car3.getYear() + "; speed = " + car3.getSpeed() + "; weight = " + car3.getWeight() + "; color = " + car3.getColor());
        System.out.println("Car3: year = " + car4.getYear() + "; speed = " + car4.getSpeed() + "; weight = " + car4.getWeight() + "; color = " + car4.getColor());
        System.out.println("Car3: year = " + car5.getYear() + "; speed = " + car5.getSpeed() + "; weight = " + car5.getWeight() + "; color = " + car5.getColor());
    }
}

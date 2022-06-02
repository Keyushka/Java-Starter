package javaEssential.homework.hw2.task4;

// Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
// Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы вызывая конструктор из конструктора.
// Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

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

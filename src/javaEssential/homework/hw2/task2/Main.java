package javaEssential.homework.hw2.task2;

// Создать класс Машина с полями год(int), цвет(String).
// Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
// Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(5);
        Car car3 = new Car(3, "black");

        System.out.println("Year: " + car1.getYear() + "; Color: " + car1.getColor());
        System.out.println("Year: " + car2.getYear() + "; Color: " + car2.getColor());
        System.out.println("Year: " + car3.getYear() + "; Color: " + car3.getColor());
    }
}

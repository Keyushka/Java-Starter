package javaEssential.homework.hw2.task5;

import java.util.Scanner;

// Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
// который должен принимать радиус и используя PI посчитать площадь круга.
// Создать класс Main, где запустить данный метод.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        if ((sc.hasNextInt()) || (sc.hasNextFloat())) {
            double radius = sc.nextFloat();
            System.out.println("Площадь круга = " + MyArea.areaOfCircle(radius));
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}

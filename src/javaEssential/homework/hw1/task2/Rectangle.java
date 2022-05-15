package javaEssential.homework.hw1.task2;

import java.util.Scanner;

public class Rectangle {
    private static double side1;
    private static double side2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину 1й стороны прямоугольника: ");
        side1 = sc.nextDouble();
        System.out.println("Введите длину 2й стороны прямоугольника: ");
        side2 = sc.nextDouble();
        Rectangle rectangle = new Rectangle();
        System.out.println("Площадь прямоугольника = " + rectangle.areaCalculator(side1, side2));
        System.out.println("Периметр прямоугольника = " + rectangle.perimeterCalculator(side1, side2));
    }

    double areaCalculator (double side1, double side2) {
        return side1 * side2;
    }
    double perimeterCalculator (double side1, double side2) {
        return 2 * (side1 + side2);
    }
}

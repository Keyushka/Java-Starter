package javaEssential.homework.hw2.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        float radius = sc.nextFloat();
        System.out.println("Площадь круга = " + MyArea.areaOfCircle(radius));
    }
}

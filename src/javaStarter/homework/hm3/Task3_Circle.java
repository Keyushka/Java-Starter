package javaStarter.homework.hm3;

import java.util.Scanner;

public class Task3_Circle {
    final static double PI = Math.PI;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double r = sc.nextDouble();
        double circleArea = PI * Math.pow(r,2);
        System.out.println("Площадь круга = " + circleArea);
    }
}

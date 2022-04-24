package javaStarter.homework.hm3;

import java.util.Scanner;

public class Task4_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус цилиндра: ");
        double R = sc.nextDouble();
        System.out.println("Введите высоту цилиндра: ");
        double h = sc.nextDouble();
        System.out.println("Объем V цилиндра = " + calculateVolume(R, h));
        System.out.println("Площадь S цилиндра = " + calculateArea(R, h));
    }

    // Метод возвращает вычисление объема цилиндра
    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Метод возвращает вычисление площади цилиндра
    public static double calculateArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }
}

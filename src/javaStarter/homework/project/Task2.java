package javaStarter.homework.project;

import java.util.Scanner;

// Напишите метод, который принимает число,
// которое не содержит нулей и возвращает цифры в обратном порядке.
// Например, на вход: 789 на выход: 987
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Напишите число, которое не содержит нулей: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Цифры числа справа налево: ");
            System.out.println(reverseLine(num));
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static int reverseLine(int num) {
        if (num < 10) {
            return num;
        } else {
            System.out.print(num % 10);
            return reverseLine(num / 10);
        }
    }
}

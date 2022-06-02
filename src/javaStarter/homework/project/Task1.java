package javaStarter.homework.project;

// Напишите метод, который принимает число и возвращает сумму цифр данного числа

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Вы ввели число: " + number);
            System.out.println("Сумма цифр данного числа = " + sumDigits(number));
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}

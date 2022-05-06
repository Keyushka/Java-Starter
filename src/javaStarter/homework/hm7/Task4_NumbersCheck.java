package javaStarter.homework.hm7;

import java.util.Scanner;

public class Task4_NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String entered = sc.next();
        double number = Double.parseDouble(entered);
        numberAnalysis(number);
    }

    private static void numberAnalysis(double number) {
        boolean isPrime = true;
        // 1) является ли введенное число положительным или отрицательным
        String result = number > 0 ? "Число является положительным" :
                        number < 0 ? "Число является отрицательным" : "Число ноль не положительное и не отрицательное, оно - целое";
        System.out.println(result);
        // 2) Является ли оно простым (используйте технику перебора значений)
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число является простым");
        } else {
            System.out.println("Число является составным");
        }
        // 3) Делится ли на 2, 5, 3, 6, 9 без остатка.
        if (number % 2 == 0 && number % 5 == 0 && number % 3 == 0 && number % 6 == 0 && number % 9 == 0) {
            System.out.println("Число делится на 2, 5, 3, 6, 9 без остатка");
        }
    }
}

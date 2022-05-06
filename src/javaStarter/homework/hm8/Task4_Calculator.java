package javaStarter.homework.hm8;

import java.util.Scanner;

public class Task4_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е целое число: ");
        int number1 = sc.nextInt();
        System.out.println("Введите 2е целое число: ");
        int number2 = sc.nextInt();
        System.out.println("Введите 3е целое число: ");
        int number3 = sc.nextInt();
        calculate(number1, number2, number3);
    }

    private static void calculate(int val1, int val2, int val3) {
        System.out.println("Значения чисел, разделенные на 5: \n" + val1 / 5 + ", " + val2 / 5 + ", " + val3 / 5);
    }
}

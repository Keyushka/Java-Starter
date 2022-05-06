package javaStarter.homework.hm7;

import java.util.Scanner;

public class Task5_Calculator {
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
    public static void calculate(int val1, int val2, int val3) {
        double average = (double) (val1 + val2 + val3) / 3;
        System.out.println("Среднее арифметическое трех целочисленных значений = " + average);
    }
}

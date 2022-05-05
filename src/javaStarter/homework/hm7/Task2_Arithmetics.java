package javaStarter.homework.hm7;

import java.util.Scanner;

public class Task2_Arithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е целое число: ");
        int number1 = sc.nextInt();
        System.out.println("Введите 2е целое число: ");
        int number2 = sc.nextInt();
        System.out.println("Введите знак арифметической операции для выполнения вычислений: ");
        String s = sc.next();
        switch (s) {
            case "+": {
                add(number1, number2);
                break;
            }
            case "-": {
                sub(number1, number2);
                break;
            }
            case "*": {
                mul(number1, number2);
                break;
            }
            case "/": {
                div(number1, number2);
                break;
            }
            default: {
                System.out.println("Вы ввели необрабатываемую программой операцию или иное недопустимое значение");
                break;
            }
        }
    }

    public static void add(int n1, int n2) {
        System.out.println("Результат суммирования чисел = " + (n1 + n2));
    }

    public static void sub(int n1, int n2) {
        System.out.println("Результат вычитания чисел = " + (n1 - n2));
    }

    public static void mul(int n1, int n2) {
        System.out.println("Результат умножения чисел = " + (n1 * n2));
    }

    public static void div(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Вы пытаетесь разделить на ноль. Арифметическая операция отменена.");
        } else {
            System.out.println("Результат деления чисел = " + ((double) n1 / n2));
        }
    }
}

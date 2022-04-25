package javaStarter.homework.hm4;

import java.util.Scanner;

public class Task1_Calculator {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 15;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак арифметической операции: ");
        String sign = sc.next();
        switch (sign){
            case "+": {
                result = operand1 + operand2;
                System.out.println("Результат суммирования чисел = " + result);
                break;
            }
            case "-": {
                result = operand1 - operand2;
                System.out.println("Результат вычетания чисел = " + result);
                break;
            }
            case "*": {
                result = operand1 * operand2;
                System.out.println("Результат умножения чисел = " + result);
                break;
            }
            case "/": {
                if (operand2 == 0){
                    System.out.println("Вы пытаетесь разделить на ноль. Арифметическая операция отменена.");
                } else {
                    double resultDivision = (double) operand1 / operand2;
                    System.out.println("Результат деления чисел = " + resultDivision);
                }
                break;
            }
            case "%": {
                if (operand2 == 0){
                    System.out.println("Вы пытаетесь разделить на ноль и вычислить остаток от деления. Арифметическая операция отменена.");
                } else {
                    result = operand1 % operand2;
                    System.out.println("Результат остатка от деления чисел = " + result);
                }
                break;
            }

            default: {
                System.out.println("Вы ввели несуществующий знак арифметической операции.");
                break;
            }
        }
    }
}

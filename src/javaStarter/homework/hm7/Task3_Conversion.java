package javaStarter.homework.hm7;

import java.util.Scanner;

public class Task3_Conversion {
    public static void main(String[] args) {
        System.out.println("Программа конвертации валют");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму денег: ");
        double moneyAmount = sc.nextDouble();
        System.out.println("Введите курс для конвертации в другую валюту: ");
        double exchangeRates = sc.nextDouble();
        System.out.println("Результат операции конвертирования валюты = " + currencyConversion(moneyAmount, exchangeRates));
    }
    private static double currencyConversion(double moneyAmount, double exchangeRates) {
        return moneyAmount * exchangeRates;
    }
}

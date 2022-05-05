package javaStarter.homework.hm7;

import java.util.Scanner;

public class Task3_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите валюту которую хотите конвертировать: ");
        String valuta = sc.next();
        System.out.println("Введите сумму денег: ");
        int number2 = sc.nextInt();
        System.out.println("Введите знак арифметической операции для выполнения вычислений: ");
        String s = sc.next();
    }
}

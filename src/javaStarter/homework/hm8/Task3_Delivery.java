package javaStarter.homework.hm8;

import java.util.Scanner;

public class Task3_Delivery {
    public static void main(String[] arg) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество клиентов: ");
        int client = sc.nextInt();
        System.out.print("Количество возможных вариантов доставки товара 1й машиной = ");

        do {
            factorial *= client--;
        } while (client > 0);

        System.out.print(factorial);
    }
}

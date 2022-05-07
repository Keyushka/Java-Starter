package javaStarter.homework.hm8;

import java.util.Scanner;

public class Task3_Delivery {
    public static void main(String[] arg) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество клиентов: ");
        int numberOfClients = sc.nextInt();
        System.out.print("Количество возможных вариантов доставки товара 1й машиной = " + factorial(numberOfClients));
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
// не рекомендуется использовать рекурсию так она может забить память, не рекомендуется использовать при больших значениях чисел
// после ввода числа 32 - уже идет минусовое значение
// после ввода числа 34 - уже идет нулевое значение

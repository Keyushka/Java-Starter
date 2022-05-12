package javaStarter.homework.hm9;

import java.util.Scanner;

public class Task2_CustomerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        // Заполнение массива произвольными целыми числами
        for (int i = 0; i < N; i++) {
            array[i] = ((int) (Math.random() * 100 - 40));
        }
        System.out.print("Элементы массива: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        int sum = 0;

        // наибольшее значение массива
        for (int i = 1; i < N; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Max is " + max);

        // наименьшее значение массива
        for (int i = 1; i < N; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Min is " + min);

        // общая сумма всех элементов
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        System.out.println("Sum is " + sum);

        // среднее арифметическое всех элементов
        System.out.println("Average is " + (double) sum / N);

        // вывести все нечетные значения
        System.out.println("Нечетные значения массива: ");
        for (int i = 0; i < N; i++) {
            if ((array[i] % 2 == 1) || (array[i] % 2 == -1)) {
                System.out.print(array[i] + " ");
            }
        }
    }
    /*public static int getRandom(int lo, int hi) {
        Random rand = new Random();
        return lo + rand.nextInt(hi - lo + 1);
    }*/
}

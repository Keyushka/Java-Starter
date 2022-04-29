package javaStarter.homework.hm5;

import java.util.Scanner;

public class Task5_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (bitCounter(number) == 1) {
            System.out.println("Число " + number + " - является степенью двойки");
        } else System.out.println("Число " + number + " - НЕ является степенью двойки");
    }
    public static int bitCounter(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}

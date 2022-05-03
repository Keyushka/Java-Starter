package javaStarter.homework.hm5;

import java.util.Scanner;

public class Task2_Parity {
    // Вариант 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else
            System.out.println("Число нечетное");
    }
    // Вариант 2
   /* public static void main(String[] args){
        System.out.println("Введите число: ");
        System.out.println("Ваше число " + (((new Scanner(System.in).nextInt() & 1) == 0) ? "четное" : "нечетное"));
    }*/
}

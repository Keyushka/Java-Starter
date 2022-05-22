package javaStarter.homework.project;

import java.util.Scanner;

// Создайте программу, которая выводит в консоль число имени, например,
// на вход Roman = R(18) + О(15) + M(13) + A(1) + N(14) = 61 на выход 61.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите любое имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        char[] nameArr = name.toCharArray();
        System.out.println("Char array:");
        int sumNumbers = 0;
        for (int i = 0; i < nameArr.length; i++) {
            int letter = name.charAt(i);
            if (Character.isLowerCase(letter)) {
                sumNumbers += letter-96;
            } else if (Character.isUpperCase(letter)) {
                sumNumbers += letter-64;
            }
        }
        System.out.println("Число введенного имени = " + sumNumbers);
        in.close();
    }
}

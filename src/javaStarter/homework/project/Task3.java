package javaStarter.homework.project;

import java.util.Scanner;

// Создайте программу, которая выводит в консоль число имени, например,
// на вход Roman = R(18) + О(15) + M(13) + A(1) + N(14) = 61 на выход 61.
public class Task3 {
    private static final int MAX_LOWERCASE_ASCII_VALUE = 96;
    private static final int MAX_UPPERCASE_ASCII_VALUE = 64;
    public static void main(String[] args) {
        System.out.println("Введите любое имя: ");
        Scanner sc = new Scanner(System.in);
        if ((sc.hasNextInt()) || (sc.hasNextDouble())) {
            System.out.println("Извините, но вы ввели не имя. Перезапустите программу и попробуйте снова!");
        } else if (sc.hasNextLine()) {
            String name = sc.nextLine();
            System.out.println("Число введенного имени = " + getNameNumber(name));
        }

       /* String name = sc.nextLine();
        if (isNumber(name)){
            System.out.println("Извините, но вы ввели не имя. Перезапустите программу и попробуйте снова!");
        } else {
            System.out.println("Число введенного имени = " + getNameNumber(name));
        }*/
    }

    /*static boolean isNumber(String s) {
        int l = s.length();
        if(s == null || l == 0)
            return false;

        for(char c: s.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }*/

    private static int getNameNumber(String name) {
        char[] nameArr = name.toCharArray();
        int sumNumbers = 0;
        for (int i = 0; i < nameArr.length; i++) {
            int letter = name.charAt(i);
            if (Character.isLowerCase(letter)) {
                sumNumbers += letter - MAX_LOWERCASE_ASCII_VALUE;
            } else if (Character.isUpperCase(letter)) {
                sumNumbers += letter - MAX_UPPERCASE_ASCII_VALUE;
            }
        }
        return sumNumbers;
    }
}

package javaStarter.homework.project;

// Напишите метод, который принимает число и возвращает сумму цифр данного числа

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        sumDigits(number);

    }
    private static void sumDigits(int number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number/=10;
        }
        System.out.println("Сумма цифр данного числа = " + sum);
    }
}

    /*final Scanner s = new Scanner ( System.in );
    final String line = s.nextLine ().trim ();
    final char [] array = line.toCharArray ();

    int sum = 0;
    for ( final char c : array )
        {
        if ( !Character.isDigit ( c ) )
        {
        throw new IllegalArgumentException ();
        }

        sum = sum + Character.getNumericValue ( c );
        }

        System.out.println ( "sum = " + sum );*/

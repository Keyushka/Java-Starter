package javaStarter.homework.project;

import java.util.Scanner;

// Создайте программу, которая выводит в консоль число даты.
// Например, на вход 02/11/1995 = 0 + 2 + 1 + 1 + 1 + 9 + 9 + 5 = 28 на выход = 28
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Напишите дату в формате дд/мм/гггг: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        System.out.println ( "Число даты = " + dateNumber(date) );
    }

    public static int dateNumber (String date) {
        String dateConversion = date.replace("/","").replace(".","").trim();
        char[] dateArr = dateConversion.toCharArray();
        int sum = 0;
        for ( char c : dateArr )
        {
            if ( !Character.isDigit ( c ) )
            {
                throw new IllegalArgumentException ("В веденном значении обнаружены либо буквы, либо недопустимые специальные символы");
            }
            sum = sum + Character.getNumericValue ( c );
        }
        return sum;
    }
}

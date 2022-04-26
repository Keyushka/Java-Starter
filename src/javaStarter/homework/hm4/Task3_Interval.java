package javaStarter.homework.hm4;

import java.util.Scanner;

public class Task3_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100: ");
        int number = sc.nextInt();
        // Вариант 1
        if (number>=0 && number<=14) {
            System.out.println("Указанное число попадает в числовой промежуток [0 - 14]");
        } else if (number>=15 && number<=35) {
            System.out.println("Указанное число попадает в числовой промежуток [15 - 35]");
        } else if (number>=36 && number<=50) {
            System.out.println("Указанное число попадает в числовой промежуток [36 - 50]");
        } else if (number>=50 && number<=100) {
            System.out.println("Указанное число попадает в числовой промежуток [50 - 100]");
        } else {
            System.out.println("Указанное число не входит ни в один из имеющихся числовых промежутков");
        }

        // Вариант 2
        /*String result;
        result = (number>=0 && number<=14) ? "Указанное число попадает в числовой промежуток [0 - 14]" :
                        (number>=15 && number<=35) ? "Указанное число попадает в числовой промежуток [15 - 35]" :
                                (number>=36 && number<=50) ? "Указанное число попадает в числовой промежуток [36 - 50]" :
                                        (number>=50 && number<=100) ? "Указанное число попадает в числовой промежуток [50 - 100]" :
                                                "Указанное число не входит ни в один из имеющихся числовых промежутков";
        System.out.println(result);*/

    }
}

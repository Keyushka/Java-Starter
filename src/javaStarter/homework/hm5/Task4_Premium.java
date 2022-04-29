package javaStarter.homework.hm5;

import java.util.Scanner;

public class Task4_Premium {
    public static void main(String[] args) {
        double premium;
        String resultText = "Сотруднику будет начислена премия в размере: ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму заработной платы сотрудника ($): ");
        int salary = sc.nextInt();
        System.out.println("Введите число соответствующее выслуге лет сотрудника: ");
        int age = sc.nextInt();
        if (age >= 0 && age < 5) {
            premium = salary * 0.1;
            System.out.println(resultText + premium + "$");
        } else if (age >= 5 && age < 10) {
            premium = salary * 0.15;
            System.out.println(resultText + premium + "$");
        } else if (age >= 10 && age < 15) {
            premium = salary * 0.25;
            System.out.println(resultText + premium + "$");
        } else if (age >= 15 && age < 20) {
            premium = salary * 0.35;
            System.out.println(resultText + premium + "$");
        } else if (age >= 20 && age < 25) {
            premium = salary * 0.45;
            System.out.println(resultText + premium + "$");
        } else if (age >= 25) {
            premium = salary * 0.5;
            System.out.println(resultText + premium + "$");
        }
    }
}

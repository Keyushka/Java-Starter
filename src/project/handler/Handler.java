package project.handler;

import java.util.Scanner;

public class Handler {
    public static void handler(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ставку: ");
        int value = sc.nextInt();
        System.out.println("Введите риск: ");
        double risk = sc.nextDouble();
        System.out.println("Мы ввели: ставку = " + value + ", риск = " + risk);
        sc.close();
    }
}

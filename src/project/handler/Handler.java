package project.handler;

import java.awt.*;
import java.util.Scanner;

public class Handler {
    public static void handler(){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите ставку: ");
        int value = sc.nextInt();
        System.out.println("Введите риск: ");
        double risk = sc.nextDouble();
        System.out.println("Мы ввели: ставку = " + value + ", риск = " + risk);
        sc.close();*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите ставку: ");
        while (true){
            String command = sc.next();
            if (command.equals("q")) {
                System.exit(0);
                //return;
            } else {
                int value = sc.nextInt();
                System.out.println("Мы ввели: ставку = " + value);
                System.out.println("Введите риск: ");
                double risk = sc.nextDouble();
                System.out.println("Мы ввели: риск = " + risk);
               // sc.close();
            }
            continue;
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ставку: ");
        while (true) {
            int value = sc.nextInt();
            if (sc.hasNext()) {
                String command = sc.nextLine();
                if (command.equals("q")) {
                    System.out.println("Exit");
                    System.exit(0);
                } else {
                    System.out.println("Введите корректные значения: ");
                };
            } else if (sc.hasNextInt()){
               // int value = sc.nextInt();
                System.out.println("Мы ввели: ставку = " + value);
                System.out.println("Введите риск: ");
                double risk = sc.nextDouble();
                System.out.println("Мы ввели: риск = " + risk);
                // sc.close();
            }
            continue;
        }
    }
}


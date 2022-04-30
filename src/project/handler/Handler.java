package project.handler;

import project.model.Bet;

import java.awt.*;
import java.util.Scanner;

public class Handler {
    private static int value;
    private static double risk;
    public static void handler(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please, enter your bet: ");
            String info = sc.next();
            if (info.equals("q")){
                break;
            } else {
                value = Integer.parseInt(info);
                System.out.println("Please, enter your bet: ");
                risk = sc.nextDouble();
                System.out.println("Your bet has been added.");
                Bet firstBet = new Bet(value, risk);
                System.out.println("If you want to exit, enter q.");
            }
        }
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

      //  Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ставку: ");
            if(sc.hasNext()) {
                String val = sc.next();
                if ("q".equals(val)) {
                    System.exit(0);
                } else {
                    //int number = sc.nextInt();
                    System.out.println("Мы ввели: ставку = " + val);
                    System.out.println("Введите риск: ");
                    String numberDouble = sc.next();
                    if ("q".equals(numberDouble)) {
                        System.exit(0);
                    }
                    System.out.println("Мы ввели: риск = " + numberDouble);
                }
            }
            //int value = sc.nextInt();
            //if (sc.hasNext()) {
            //    String command = sc.nextLine();
            //    if (command.equals("q")) {
            //        System.out.println("Exit");

            //    } /*else {
                    //System.out.println("Введите корректные значения: ");
              //  };*/
           /* } else if (sc.hasNextInt()){
                int value = sc.nextInt();
                System.out.println("Мы ввели: ставку = " + value);
                System.out.println("Введите риск: ");
                double risk = sc.nextDouble();
                System.out.println("Мы ввели: риск = " + risk);
                // sc.close();
            }
            continue;*/
        }
    }
}


package javaStarter.homework.hm8;

import java.util.Scanner;

public class Task2_Bank {
    static int monthlyPayment = 100;
    static int numberOfPayments = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму платежа: ");
        int payment = in.nextInt();
        creditStatus(payment);
    }

    public static void creditStatus(int payment) {
        int debt = monthlyPayment * numberOfPayments;
        if (payment < debt) {
            int debtAmount = debt - payment;
            System.out.println("Сумма задолженности = " + debtAmount);
        } else if (payment == debt) {
            System.out.println("Долг полносью погашен");
        } else if (payment > debt) {
            int overpayment_Amount = payment - debt;
            System.out.println("Долг погашен, но у клиента есть переплата: " + overpayment_Amount);
        }
    }
}

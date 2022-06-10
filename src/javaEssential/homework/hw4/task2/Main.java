package javaEssential.homework.hw4.task2;

import javaEssential.homework.hw4.task2.impl.DOCHandler;
import javaEssential.homework.hw4.task2.impl.TXTHandler;
import javaEssential.homework.hw4.task2.impl.XMLHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        chooseDocumentFormat(scan);
    }
    private static void chooseDocumentFormat (Scanner scan) {
        boolean input = true;
        System.out.println("\u001B[35m" + "Введите формат документа для работы: XML, TXT, DOC (для выхода - exit)" + "\u001B[0m");
        while (input) {
            switch (scan.next().toUpperCase()) {
                case "XML": {
                    AbstractHandler xml = new XMLHandler();
                    input = false;
                    break;
                }
                case "TXT": {
                    AbstractHandler txt = new TXTHandler();
                    input = false;
                    break;
                }
                case "DOC": {
                    AbstractHandler doc = new DOCHandler();
                    input = false;
                    break;
                }
                case "EXIT": {
                    input = false;
                    System.out.println("Выход из программы");
                    break;
                }
                default: {
                    System.out.println("Программа не поддерживает данный формат. Попробуйте снова.");
                }
            }
        }
    }
}

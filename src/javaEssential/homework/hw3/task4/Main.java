package javaEssential.homework.hw3.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ключ доступа (Pro и Exp соответственно)");
        System.out.println("При ошибочном вводе ключа доступа вы можете пользоваться бесплатной версией");
        getAccess(scan);
    }
    private static void getAccess(Scanner scan) {
        DocumentWorker document;
        switch (scan.next()) {
            case "Pro": {
                document = new ProDocumentWorker();
                System.out.println("--Вы используете профессиональную (Pro) версию программы--");
                document.openDocument();
                document.editDocument();
                document.saveDocument();
                break;
            }
            case "Exp": {
                document = new ExpertDocumentWorker();
                System.out.println("--Вы используете экспертную (Expert) версию программы--");
                document.openDocument();
                document.editDocument();
                document.saveDocument();
                break;
            }
            default: {
                document = new DocumentWorker();
                System.out.println("--Вы используете бесплатную (Free) версию программы--");
                document.openDocument();
                document.editDocument();
                document.saveDocument();
            }
        }
    }
}

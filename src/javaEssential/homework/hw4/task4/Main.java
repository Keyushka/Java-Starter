package javaEssential.homework.hw4.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        getAccess(scan);
    }

    private static void getAccess(Scanner scan) {
        System.out.println("\u001B[35m" + "Введите ключ доступа (Pro и Exp соответственно)" + "\u001B[0m");
        System.out.println("При ошибочном вводе ключа доступа вы можете пользоваться бесплатной версией");
        Document document;
        switch (scan.next()) {
            case "Pro": {
                document = new ProDocumentWorker();
                System.out.println("--Вы используете профессиональную (Pro) версию программы--");
                getFunction(scan, document);
                break;
            }
            case "Exp": {
                document = new ExpertDocumentWorker();
                System.out.println("--Вы используете экспертную (Expert) версию программы--");
                getFunction(scan, document);
                break;
            }
            default: {
                document = new DocumentWorker();
                System.out.println("--Вы используете бесплатную (Free) версию программы--");
                getFunction(scan, document);
            }
        }
    }

    private static void getFunction(Scanner scan, Document document) {
        boolean input = true;
        while (input) {
            System.out.println("\u001B[35m" + "1 - Открыть документ,  2 - Редактировать документ,  3 - Сохранить документ,  0 - Выход" + "\u001B[0m");
            switch (scan.next()) {
                case "1": {
                    document.openDocument();
                    break;
                }
                case "2": {
                    document.editDocument();
                    break;
                }
                case "3": {
                    document.saveDocument();
                    break;
                }
                case "0": {
                    input = false;
                    System.out.println("Выход из программы");
                    break;
                }
                default: {
                    System.out.println("Программа не распознала код функции. Возможно вы ошиблись. Попробуйте снова.");
                }
            }
        }
    }
}

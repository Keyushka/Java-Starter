package javaEssential.homework.hw4.task5;

public class ExpertDocumentWorker extends Document {

    @Override
    void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}

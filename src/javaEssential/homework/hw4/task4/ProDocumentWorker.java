package javaEssential.homework.hw4.task4;

public class ProDocumentWorker extends Document {

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
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}

package javaEssential.homework.hw3.task4;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        super.editDocument();
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}

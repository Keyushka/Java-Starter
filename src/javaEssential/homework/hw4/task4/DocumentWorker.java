package javaEssential.homework.hw4.task4;

public class DocumentWorker extends Document {

    @Override
    void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    @Override
    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}

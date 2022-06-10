package javaEssential.homework.hw4.task2.impl;

import javaEssential.homework.hw4.task2.AbstractHandler;

public class DOCHandler extends AbstractHandler {
    public DOCHandler() {
        System.out.println("Для документа с форматом DOC вы можете использовать следующие операции:");
        open();
        create();
        change();
        save();
    }

    @Override
    public void open() {
        System.out.println("открытие DOC файла");
    }

    @Override
    public void create() {
        System.out.println("создание DOC файла");
    }

    @Override
    public void change() {
        System.out.println("редактирование DOC файла");
    }

    @Override
    public void save() {
        System.out.println("сохранение DOC файла");
    }
}

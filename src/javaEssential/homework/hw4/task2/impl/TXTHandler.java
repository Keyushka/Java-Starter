package javaEssential.homework.hw4.task2.impl;

import javaEssential.homework.hw4.task2.AbstractHandler;

public class TXTHandler extends AbstractHandler {
    public TXTHandler() {
        System.out.println("Для документа с форматом TXT вы можете использовать следующие операции:");
        open();
        create();
        change();
        save();
    }
    @Override
    public void open() {
        System.out.println("открытие TXT файла");
    }

    @Override
    public void create() {
        System.out.println("создание TXT файла");
    }

    @Override
    public void change() {
        System.out.println("редактирование TXT файла");
    }

    @Override
    public void save() {
        System.out.println("сохранение TXT файла");
    }
}

package javaEssential.homework.hw4.task2.impl;

import javaEssential.homework.hw4.task2.AbstractHandler;

public class XMLHandler extends AbstractHandler {
    public XMLHandler() {
        System.out.println("Для документа с форматом XML вы можете использовать следующие операции:");
        open();
        create();
        change();
        save();
    }
    @Override
    public void open() {
        System.out.println("открытие XML файла");
    }

    @Override
    public void create() {
        System.out.println("создание XML файла");
    }

    @Override
    public void change() {
        System.out.println("редактирование XML файла");
    }

    @Override
    public void save() {
        System.out.println("сохранение XML файла");
    }
}

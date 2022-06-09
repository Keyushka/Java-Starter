package javaEssential.homework.hw4.task2.services.impl;

import javaEssential.homework.hw4.task2.services.AbstractHandler;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("DOC файл открыт");
    }

    @Override
    public void create() {
        System.out.println("DOC файл создан");

    }

    @Override
    public void change() {
        System.out.println("DOC файл отредактирован");
    }

    @Override
    public void save() {
        System.out.println("DOC файл сохранен");
    }
}

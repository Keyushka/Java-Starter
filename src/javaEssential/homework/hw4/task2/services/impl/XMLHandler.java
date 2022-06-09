package javaEssential.homework.hw4.task2.services.impl;

import javaEssential.homework.hw4.task2.services.AbstractHandler;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML файл открыт");
    }

    @Override
    public void create() {
        System.out.println("XML файл создан");

    }

    @Override
    public void change() {
        System.out.println("XML файл отредактирован");
    }

    @Override
    public void save() {
        System.out.println("XML файл сохранен");
    }
}

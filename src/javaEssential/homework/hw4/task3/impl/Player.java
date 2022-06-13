package javaEssential.homework.hw4.task3.impl;

import javaEssential.homework.hw4.task3.interfaces.Playable;
import javaEssential.homework.hw4.task3.interfaces.Recodable;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Проигрывание");
    }

    @Override
    public void record() {
        System.out.println("Запись");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Остановить");
    }
}

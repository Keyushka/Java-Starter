package javaEssential.homework.hw3.task2;

public class BadPupil extends Pupil{
    public BadPupil(String nameOfPupil) {
        super(nameOfPupil);
    }

    @Override
    void study() {
        System.out.println("Плохая обучаемость");
    }

    @Override
    void read() {
        System.out.println("Плохо читает");
    }

    @Override
    void write() {
        System.out.println("Плохо пишет");
    }

    @Override
    void relax() {
        System.out.println("Сидит в смартфоне");
    }
}

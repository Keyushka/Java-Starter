package javaEssential.homework.hw3.task2;

public class GoodPupil extends Pupil{
    public GoodPupil(String nameOfPupil) {
        super(nameOfPupil);
    }

    @Override
    void study() {
        System.out.println("Хорошо обучается");
    }

    @Override
    void read() {
        System.out.println("Хорошо читает");
    }

    @Override
    void write() {
        System.out.println("Хорошо пишет");
    }

    @Override
    void relax() {
        System.out.println("Занимается физической активностью");
    }
}

package javaEssential.homework.hw3.task2;

public class ExcelentPupil extends Pupil{
    public ExcelentPupil(String nameOfPupil) {
        super(nameOfPupil);
    }

    @Override
    void study() {
        System.out.println("Прекрасно обучается");
    }

    @Override
    void read() {
        System.out.println("Прекрасно читает");
    }

    @Override
    void write() {
        System.out.println("Прекрасно пишет");
    }

    @Override
    void relax() {
        System.out.println("Занимается танцами, йогой, футболом...");
    }
}

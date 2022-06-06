package javaEssential.homework.hw3.task2;

public class Pupil {
    private String nameOfPupil;

    public Pupil(String nameOfPupil) {
        this.nameOfPupil = nameOfPupil;
    }

    public String getNameOfPupil() {
        return nameOfPupil;
    }

    public void setNameOfPupil(String nameOfPupil) {
        this.nameOfPupil = nameOfPupil;
    }

    void study() {
        System.out.println("Склонность к обучаемости");
    }
    void read() {
        System.out.println("Умеет читать");
    }
    void write() {
        System.out.println("Умеет писать");
    }
    void relax() {
        System.out.println("Умеет отдыхать/расслабляться");
    }
}

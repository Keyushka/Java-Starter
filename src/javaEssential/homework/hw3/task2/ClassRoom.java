package javaEssential.homework.hw3.task2;

import javaEssential.lessons.l3.bird.Bird;

public class ClassRoom {
    private Pupil pupil1 = new ExcelentPupil("Matvey");
    private Pupil pupil2 = new GoodPupil("Danil");
    private Pupil pupil3 = new BadPupil("Anton");
    private Pupil pupil4 = new ExcelentPupil("Sergey");

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }

    public static void main(String[] args) {
        Pupil pupil1 = new ExcelentPupil("Matvey");
        Pupil pupil2 = new GoodPupil("Danil");
        Pupil pupil3 = new BadPupil("Anton");
        Pupil pupil4 = new ExcelentPupil("Sergey");

        Pupil[] pupils = {pupil1, pupil2, pupil3, pupil4};
        for (Pupil p: pupils) {
            System.out.println("Ученик " + p.getNameOfPupil() + ": ");
            p.study();
            p.read();
            p.write();
            p.relax();
            System.out.println();
        }
        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);


    }
}

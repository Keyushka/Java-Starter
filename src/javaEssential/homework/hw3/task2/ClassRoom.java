package javaEssential.homework.hw3.task2;
import java.util.Random;

// Создать класс, представляющий учебный класс ClassRoom.
// Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
// Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите каждый из методов,
// в зависимости от успеваемости ученика. Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
// Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
// Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.

public class ClassRoom {
    private Pupil pupil1;
    private Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
        Pupil[] pupils = {pupil1, pupil2, pupil3, pupil4};
        System.out.println("=== Ученики класса ===");
        getPupilInfo(pupils);
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        Pupil[] pupils = {pupil1, pupil2, pupil3};
        System.out.println("=== Ученики класса ===");
        getPupilInfo(pupils);
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        Pupil[] pupils = {pupil1, pupil2};
        System.out.println("=== Ученики класса ===");
        getPupilInfo(pupils);
    }

    private Pupil generatePupil() {
        Random random = new Random();
        Pupil pupil = new ExcelentPupil("pupil_" + random.nextInt(4));
        return pupil;

    }

    private void getPupilInfo(Pupil[] pupils) {
        for (Pupil p : pupils) {
            System.out.println("Ученик " + p.getNameOfPupil() + ": ");
            p.study();
            p.read();
            p.write();
            p.relax();
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Pupil pupil1 = new ExcelentPupil("Matvey");
        Pupil pupil2 = new GoodPupil("Danil");
        Pupil pupil3 = new BadPupil("Anton");
        Pupil pupil4 = new ExcelentPupil("Sergey");

        ClassRoom classRoom1 = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        ClassRoom classRoom2 = new ClassRoom(pupil1, pupil2, pupil3);

    }

    private Pupil generatePupil(String typeOfPupil) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(7);
            sb.append(str.charAt(number));
        }
        if (typeOfPupil == "Excelent") {
            Pupil pupil = new ExcelentPupil(sb.toString());
            return pupil;
        } else if (typeOfPupil == "Good") {
            Pupil pupil = new GoodPupil(sb.toString());
            return pupil;
        } else if (typeOfPupil == "Bad") {
            Pupil pupil = new BadPupil(sb.toString());
            return pupil;
        }
        return null;
    }
}

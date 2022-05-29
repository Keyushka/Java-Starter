package javaEssential.lessons.l2_classes_and_objects.lesson;

import javaEssential.lessons.l2_classes_and_objects.lesson.models.Velo;

public class Main {
    public static void main(String[] args) {
        Velo v = new Velo("speedy", 12);
        System.out.println(v.speedUp(3));
    }
}

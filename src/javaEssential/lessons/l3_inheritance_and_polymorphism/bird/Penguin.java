package javaEssential.lessons.l3_inheritance_and_polymorphism.bird;

public class Penguin extends Bird{
    @Override
    public void move() {
        System.out.println("Swim");
    }
}

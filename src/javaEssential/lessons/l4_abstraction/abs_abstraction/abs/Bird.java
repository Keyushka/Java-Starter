package javaEssential.lessons.l4_abstraction.abs_abstraction.abs;

public abstract class Bird implements Creator{
    public void live() {
        System.out.println("I can live");
    }
    public abstract void move();
    public void eat() {
        System.out.println("I can eat");
    }
}

package javaEssential.lessons.l4_abstraction.models2;

public interface CDPlayer {
    double PI = 3.14; //by default = public final

    default void print() {
        System.out.println("debug info");
    }

    static void debug() {
        System.out.println("debug");
    }
    void play();
}

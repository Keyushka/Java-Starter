package javaEssential.lessons.l4_abstraction.abs_interfaces.ex001_interfaces;

/**
 * Интерфейсы.
 */

interface Interface {
    void method();
}

class MyClass implements Interface {
    public void method() {
        System.out.println("Method - realizaciya Interface.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.method();
    }
}

package javaEssential.lessons.l3_inheritance_and_polymorphism.ex002_inheritance;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        System.out.println(instance.publicField);
        instance.show();
    }
}

package javaEssential.lessons.l3_inheritance_and_polymorphism.ex004_constructors;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass(1, 2);

        System.out.println(instance.baseNumber);
        System.out.println(instance.derivedField);
    }
}

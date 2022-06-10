package javaEssential.lessons.l3_inheritance_and_polymorphism.ex007_override;

/**
 * Полиморфизм.
 */
public class DerivedClass extends BaseClass {
    // Переопределение метода базового класса.

    @Override
    public void method() {
        System.out.println("method from DerivedClass");
    }
}

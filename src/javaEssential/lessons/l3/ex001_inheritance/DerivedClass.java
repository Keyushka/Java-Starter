package javaEssential.lessons.l3.ex001_inheritance;

/**
 * Наследование.
 */
public class DerivedClass extends BaseClass {
    // Конструктор.
    public DerivedClass() {
        // Изменяем все доступные поля унаследованные от базового класса.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}

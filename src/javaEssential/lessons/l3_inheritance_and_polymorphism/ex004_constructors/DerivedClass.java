package javaEssential.lessons.l3_inheritance_and_polymorphism.ex004_constructors;

/**
 * Наследование
 */
public class DerivedClass extends BaseClass {
    public int derivedField;

    // Конструктор по умолчанию.
    public DerivedClass() {
    }

    // пользовательский конструктор.
    // вызывается пользовательский конструктор базового класса, при этом не нужно,
    // присваивать значения, унаследованным членам в конструкторе производного класса.
    public DerivedClass(int number1, int number2) {
        super(number1);
        derivedField = number2;
    }
}

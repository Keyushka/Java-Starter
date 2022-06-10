package javaEssential.lessons.l3_inheritance_and_polymorphism.models2;

public class Lion extends Cat {
    public Lion(String name) {
        super(name);
    }

    public Lion(String name, String numberOfLegs) {
        super(name, numberOfLegs);
    }
}

package javaEssential.lessons.l3.models2;

public class Cat extends Animal{
    public String numberOfLegs;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public String getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(String numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}

package javaEssential.lessons.l3.models2;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Bars");
        Cat cat = new Lion("Toi");
        Animal animal = new Lion("Tro");
        Object obj = new Lion("Rosha");

        Velo v = new Velo();
        Animal[] animals = new Animal[2];
        animals[0] = lion;
       // animals[1] = v; //нельзя
    }

    public static void doSomething (Object obj) {
        if (obj instanceof Lion) {
            Lion l = (Lion) obj;
        }
    }
}

package javaEssential.lessons.l4_abstraction.abs_abstraction.abs;

public class Main {
    public static void main(String[] args) {
        //Bird b = new Bird(); - объект абстрактного класса нельзя создать напрямую через конструктор абстрактного класса
        Bird p = new Penguin();
        Bird s = new Strauss();
        Bird sw = new Swallow();
        p.move();
        s.move();
        sw.move();
    }
}

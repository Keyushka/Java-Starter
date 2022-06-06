package javaEssential.lessons.l3.bird;

public class Main {
    public static void main(String[] args) {
        Bird s = new Strauss();
        Bird p = new Penguin();
        Bird sw = new Swallow();
        Bird[] birds = {s, p, sw};
        for (Bird temp: birds) {
            temp.move();
        }
    }
}

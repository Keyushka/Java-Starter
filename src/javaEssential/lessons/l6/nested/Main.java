package javaEssential.lessons.l6.nested;

public class Main {
    public static void main(String[] args) {
        Car bmv = new Car("Red", "X6");
        Car.Engine motor = bmv.new Engine(200);
        motor.start();
        motor.stop();

    }
}

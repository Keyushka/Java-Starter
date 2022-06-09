package javaEssential.lessons.l6.nested;

public class Car {
    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void go() {
        System.out.println("I can go");
    }

    public class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }

        public void start() {
            System.out.println("Start");
        }
        public void stop() {
            System.out.println("Stop");
        }
    }
}

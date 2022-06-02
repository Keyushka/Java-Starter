package javaEssential.lessons.l3.models;

public class Bus extends Transport {
    private int fuel;

    public Bus(long id, String driver, Route route, String type) {
        super(id, driver, route, type);
    }

    public Bus(long id, String driver, Route route, String type, int fuel) {
        this(id, driver, route, type);
        this.fuel = fuel;
    }


    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}

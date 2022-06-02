package javaEssential.lessons.l3.models;

import javaEssential.lessons.l3.models.Route;

public class Transport {
    private long id;
    private String driver;
    private String type;
    private Route route;

    public Transport(long id, String driver, Route route, String type) {
        this.id = id;
        this.driver = driver;
        this.route = route;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

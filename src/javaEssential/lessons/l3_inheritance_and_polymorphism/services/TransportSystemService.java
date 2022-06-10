package javaEssential.lessons.l3_inheritance_and_polymorphism.services;

import javaEssential.lessons.l3_inheritance_and_polymorphism.models.Route;
import javaEssential.lessons.l3_inheritance_and_polymorphism.models.Transport;

import java.util.Optional;

public class TransportSystemService {
    private Transport[] transports;
    private Route[] routes;

    public TransportSystemService(Transport[] transports, Route[] routes) {
        this.transports = transports;
        this.routes = routes;
    }
    public Optional<Transport> findTransportById(int id) { //обертка чтоб не упасть
        for (Transport t: transports) {
            if (t.getId() == id) {
                return Optional.ofNullable(transports[id-1]);
            }
        }
        return Optional.empty(); //возвращаем пустой обьект чтоб не упасть на значении "null"
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }

    public Route[] getRoutes() {
        return routes;
    }

    public void setRoutes(Route[] routes) {
        this.routes = routes;
    }
}

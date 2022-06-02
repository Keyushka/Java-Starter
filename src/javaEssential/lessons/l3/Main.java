package javaEssential.lessons.l3;

import javaEssential.lessons.l3.models.Bus;
import javaEssential.lessons.l3.models.Route;
import javaEssential.lessons.l3.models.Tram;
import javaEssential.lessons.l3.models.Transport;
import javaEssential.lessons.l3.services.TransportSystemService;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Route hospitalCemestry = new Route(1L,"Hospital", "Cemestry");
        Route mallBank = new Route(1L,"Hall", "Bank");
        Route[] routes = new Route[2];
        routes[0] = hospitalCemestry;
        routes[1] = mallBank;

        Transport bus = new Bus(1L, "Ivan", hospitalCemestry, "Wide", 12);
        Transport tram = new Tram(2L, "Ivan", hospitalCemestry, "Wide", true);
        Transport[] transports = new Transport[2];
        transports[0] = bus;
        transports[1] = tram;

        TransportSystemService transportSystemService = new TransportSystemService(transports, routes);
        Optional<Transport> searchedTransport = transportSystemService.findTransportById(666);
        System.out.println(searchedTransport);

        if (searchedTransport.isPresent()) {
            System.out.println(searchedTransport.get());
            searchedTransport.get().setRoute(mallBank);
        } else {
            System.out.println("Не найдено!");
        }
       // searchedTransport.setRoute(mallBank);
       // System.out.println(searchedTransport.getRoute());
    }
}

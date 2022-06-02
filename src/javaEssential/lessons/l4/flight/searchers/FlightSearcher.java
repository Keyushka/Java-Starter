package javaEssential.lessons.l4.flight.searchers;

import javaEssential.lessons.l4.flight.models.Ticket;

public interface FlightSearcher {
    Ticket[] getAllAvailableFlights();
    boolean bookTicket(int id);
}
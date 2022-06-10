package javaEssential.lessons.l4_abstraction.flight.searchers;

import javaEssential.lessons.l4_abstraction.flight.models.Ticket;

public interface FlightSearcher {
    Ticket[] getAllAvailableFlights();
    boolean bookTicket(int id);
}
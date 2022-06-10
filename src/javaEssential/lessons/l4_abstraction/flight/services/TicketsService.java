package javaEssential.lessons.l4_abstraction.flight.services;

import javaEssential.lessons.l4_abstraction.flight.models.Ticket;

public interface TicketsService {
    void findTheCheapestTicket(Ticket[] airlines);
}

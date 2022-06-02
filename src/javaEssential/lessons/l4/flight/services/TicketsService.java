package javaEssential.lessons.l4.flight.services;

import javaEssential.lessons.l4.flight.models.Ticket;

public interface TicketsService {
    void findTheCheapestTicket(Ticket[] airlines);
}

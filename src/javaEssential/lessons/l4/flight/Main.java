package javaEssential.lessons.l4.flight;

import javaEssential.lessons.l4.flight.models.Ticket;
import javaEssential.lessons.l4.flight.searchers.FlightSearcher;
import javaEssential.lessons.l4.flight.searchers.implementations.AmericaAirlinesSearcherImpl;
import javaEssential.lessons.l4.flight.searchers.implementations.TurkishAirlinesSearcherImpl;
import javaEssential.lessons.l4.flight.services.AdminTicketsService;

public class Main {
    public static void main(String[] args) {
        FlightSearcher americaFL = new AmericaAirlinesSearcherImpl();
        FlightSearcher turkishFL = new TurkishAirlinesSearcherImpl();
        FlightSearcher[] flightSearchers = {americaFL, turkishFL};
        AdminTicketsService adminTicketsService = new AdminTicketsService(flightSearchers);
        adminTicketsService.printAllFlights();

        Ticket[] americaAirlinesTickets = new AmericaAirlinesSearcherImpl().getAllAvailableFlights();
        Ticket[] turkishAirlinesTickets = new TurkishAirlinesSearcherImpl().getAllAvailableFlights();
        adminTicketsService.findTheCheapestTicket(americaAirlinesTickets);
        adminTicketsService.findTheCheapestTicket(turkishAirlinesTickets);
    }
}

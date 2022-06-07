package javaEssential.lessons.l4.flight.services;

import javaEssential.lessons.l4.flight.models.Ticket;
import javaEssential.lessons.l4.flight.searchers.FlightSearcher;

import java.util.Arrays;

public class AdminTicketsService implements TicketsService {
    private FlightSearcher[] flightSearchers;
    private Ticket ticketMinPrice;

    public AdminTicketsService(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public FlightSearcher[] getFlightSearchers() {
        return flightSearchers;
    }

    public void setFlightSearchers(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public void printAllFlights() {
        for (FlightSearcher fl : flightSearchers) {
            System.out.println(Arrays.toString(fl.getAllAvailableFlights()));
        }
    }

    @Override
    public void findTheCheapestTicket(Ticket[] airlines) {
        /*for (Ticket t : airlines) {
            System.out.println(t);
        }*/

        int minPrice = airlines[0].getPrice();

        for (int i = 1; i < airlines.length; i++) {
            if (airlines[i].getPrice() < minPrice) {
                minPrice = airlines[i].getPrice();
                ticketMinPrice = airlines[i];
            }
        }
       // System.out.println("Min price = " + minPrice);
        System.out.println("Билет с минимальной ценой для выбранной компании: ");
        System.out.println(ticketMinPrice);
    }

    public Ticket findTheCheapestTicket() {
        Ticket[] ticketsMin = new Ticket[flightSearchers.length];
        for (int i = 0; i < flightSearchers.length; i++) {
            Ticket[] allAvailableFlights = flightSearchers[i].getAllAvailableFlights();
            ticketsMin[i] = findMinTicketsValue(allAvailableFlights);
        }
        return findMinTicketsValue(ticketsMin);
    }

    private Ticket findMinTicketsValue(Ticket[] tickets) {
        int minPrice = tickets[0].getPrice();
        Ticket tempMin = tickets[0];
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getPrice() < minPrice) {
                minPrice = tickets[i].getPrice();
                tempMin = tickets[i];
            }
        }
        return tempMin;
    }
}

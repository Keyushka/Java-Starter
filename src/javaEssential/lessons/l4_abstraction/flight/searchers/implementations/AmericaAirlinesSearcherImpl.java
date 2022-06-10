package javaEssential.lessons.l4_abstraction.flight.searchers.implementations;

import javaEssential.lessons.l4_abstraction.flight.models.Ticket;
import javaEssential.lessons.l4_abstraction.flight.searchers.FlightSearcher;

public class AmericaAirlinesSearcherImpl implements FlightSearcher {
    @Override
    public Ticket[] getAllAvailableFlights() {
        String URL = "http://americaairlines.com/find";
        System.out.println("Обращаюсь на сайт " + URL);
        Ticket[] americaTikets = new Ticket[2];
        americaTikets[0] = new Ticket(1, "Rome-Paris", 700);
        americaTikets[1] = new Ticket(2, "Madrid-Kyiv", 300);
        convertFromCSV(americaTikets);
        return americaTikets;
    }

    @Override
    public boolean bookTicket(int id) {
        System.out.println("Выполняю фоновую проверку документов...");
        Ticket[] americaAirlinesTikets = getAllAvailableFlights();
        for (Ticket it: americaAirlinesTikets) {
            if (it.getId() == id) {
                System.out.println("Билет забронирован");
                return true;
            }
        }
        return false;
    }

    private  void convertFromCSV(Ticket[] tickets) {
        System.out.println("Я конвертирую данные с формата CSV");
    }
}

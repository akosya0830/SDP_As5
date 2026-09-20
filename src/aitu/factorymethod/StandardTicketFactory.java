package aitu.factorymethod;

public class StandardTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket(String movieName) {
        return new StandardTicket(movieName);
    }
}

package aitu.factorymethod;

public class VIPTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket(String movieName) {
        return new VIPTicket(movieName);
    }
}

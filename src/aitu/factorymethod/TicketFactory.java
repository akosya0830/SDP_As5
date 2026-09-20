package aitu.factorymethod;

public abstract class TicketFactory {
    public abstract Ticket createTicket(String movieName);

    public Ticket orderTicket(String movieName) {
        Ticket ticket = createTicket(movieName);
        System.out.println("Система оформляет: " + ticket.getDetails());
        return ticket;
    }
}

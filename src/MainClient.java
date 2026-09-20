import aitu.factorymethod.*;
import abstractfactory.*;

public class MainClient {
    public static void main(String[] args) {
        // --- Часть А: Factory Method ---
        System.out.println("--- ГЕНЕРАЦИЯ БИЛЕТОВ (FACTORY METHOD) ---");

        TicketFactory standardFactory = new StandardTicketFactory();
        Ticket standardTicket = standardFactory.orderTicket("Интерстеллар");

        TicketFactory vipFactory = new VIPTicketFactory();
        Ticket vipTicket = vipFactory.orderTicket("Дюна 2");

        // --- Часть B: Abstract Factory ---
        System.out.println("\n--- ОФОРМЛЕНИЕ ЗАКАЗА (ABSTRACT FACTORY) ---");

        // Сценарий 1: Клиент покупает стандартный билет онлайн
        System.out.println(">> Сценарий: Онлайн-покупка");
        BookingFactory onlineExperience = new OnlineBookingFactory();
        Payment onlinePayment = onlineExperience.createPayment();
        Delivery onlineDelivery = onlineExperience.createDelivery();

        onlinePayment.pay(standardTicket.getPrice());
        onlineDelivery.deliver();

        // Сценарий 2: Клиент покупает VIP-билет на кассе (оффлайн)
        System.out.println("\n>> Сценарий: Покупка на кассе");
        BookingFactory offlineExperience = new OfflineBookingFactory();
        Payment offlinePayment = offlineExperience.createPayment();
        Delivery offlineDelivery = offlineExperience.createDelivery();

        offlinePayment.pay(vipTicket.getPrice());
        offlineDelivery.deliver();
    }
}

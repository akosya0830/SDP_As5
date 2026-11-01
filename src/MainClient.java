import aitu.factorymethod.*;
import abstractfactory.*;
import strategy.*;
import visitor.*;
import java.util.ArrayList;
import java.util.List;

public class MainClient {
    public static void main(String[] args) {
        // --- Часть A: Factory Method ---
        System.out.println("--- ГЕНЕРАЦИЯ БИЛЕТОВ (FACTORY METHOD) ---");

        TicketFactory standardFactory = new StandardTicketFactory();
        Ticket standardTicket = standardFactory.orderTicket("Интерстеллар");

        TicketFactory vipFactory = new VIPTicketFactory();
        Ticket vipTicket = vipFactory.orderTicket("Дюна 2");

        // --- Часть B: Abstract Factory ---
        System.out.println("\n--- ОФОРМЛЕНИЕ ЗАКАЗА (ABSTRACT FACTORY) ---");

        // Сценарий 1: Онлайн-покупка
        System.out.println(">> Сценарий: Онлайн-покупка");
        BookingFactory onlineExperience = new OnlineBookingFactory();
        Payment onlinePayment = onlineExperience.createPayment();
        Delivery onlineDelivery = onlineExperience.createDelivery();

        onlinePayment.pay(standardTicket.getPrice());
        onlineDelivery.deliver();

        // Сценарий 2: Покупка на кассе
        System.out.println("\n>> Сценарий: Покупка на кассе");
        BookingFactory offlineExperience = new OfflineBookingFactory();
        Payment offlinePayment = offlineExperience.createPayment();
        Delivery offlineDelivery = offlineExperience.createDelivery();

        offlinePayment.pay(vipTicket.getPrice());
        offlineDelivery.deliver();

        // --- Часть C: Strategy Pattern (Ассайнмент 5) ---
        System.out.println("\n--- ДИНАМИЧЕСКОЕ ЦЕНООБРАЗОВАНИЕ (STRATEGY) ---");

        System.out.println(">> Обычный расчет цены:");
        TicketOrder myOrder = new TicketOrder("Интерстеллар", 3000.0, new StandardPricingStrategy());
        myOrder.printOrderDetails();

        System.out.println(">> Применена скидка студента:");
        myOrder.setPricingStrategy(new StudentDiscountStrategy());
        myOrder.printOrderDetails();

        System.out.println(">> Апгрейд до VIP-зала:");
        myOrder.setPricingStrategy(new VipPremiumStrategy());
        myOrder.printOrderDetails();

        // --- Часть D: Visitor Pattern (Ассайнмент 6) ---
        System.out.println("\n--- ОБСЛУЖИВАНИЕ КИНОЗАЛОВ (VISITOR) ---");

        // Object Structure: Создаем список всех залов в нашем кинотеатре
        List<CinemaHall> cinemaHalls = new ArrayList<>();
        cinemaHalls.add(new StandardHall());
        cinemaHalls.add(new VIPHall());

        // Создаем наших "посетителей" (службы)
        HallVisitor cleaner = new CleaningVisitor();
        HallVisitor inspector = new QualityCheckVisitor();

        // 1. Запускаем клининг во всех залах
        System.out.println(">> Утренний обход: Клининг");
        for (CinemaHall hall : cinemaHalls) {
            hall.accept(cleaner);
        }

        // 2. Запускаем техпроверку во всех залах
        System.out.println("\n>> Вечерний обход: Техническая проверка");
        for (CinemaHall hall : cinemaHalls) {
            hall.accept(inspector);
        }
    }
}
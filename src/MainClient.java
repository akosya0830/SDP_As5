import aitu.factorymethod.*;
import abstractfactory.*;
import strategy.*;

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

        System.out.println(">> Сценарий: Онлайн-покупка");
        BookingFactory onlineExperience = new OnlineBookingFactory();
        Payment onlinePayment = onlineExperience.createPayment();
        Delivery onlineDelivery = onlineExperience.createDelivery();

        onlinePayment.pay(standardTicket.getPrice());
        onlineDelivery.deliver();

        System.out.println("\n>> Сценарий: Покупка на кассе");
        BookingFactory offlineExperience = new OfflineBookingFactory();
        Payment offlinePayment = offlineExperience.createPayment();
        Delivery offlineDelivery = offlineExperience.createDelivery();

        offlinePayment.pay(vipTicket.getPrice());
        offlineDelivery.deliver();

// --- Часть C: Strategy Pattern ---
        System.out.println("\n--- ДИНАМИЧЕСКОЕ ЦЕНООБРАЗОВАНИЕ (STRATEGY) ---");

// 1. Клиент выбирает фильм "Интерстеллар" по базовой цене 3000 тг.
        System.out.println(">> Обычный расчет цены:");
    TicketOrder myOrder = new TicketOrder("Интерстеллар", 3000.0, new StandardPricingStrategy());
        myOrder.printOrderDetails();

// 2. Клиент показывает студенческий билет. Меняем поведение на лету!
        System.out.println(">> Применена скидка студента:");
        myOrder.setPricingStrategy(new

    StudentDiscountStrategy());
        myOrder.printOrderDetails();

// 3. Клиент решает проапгрейдить билет до VIP-зала. Снова меняем поведение.
        System.out.println(">> Апгрейд до VIP-зала:");
        myOrder.setPricingStrategy(new

    VipPremiumStrategy());
        myOrder.printOrderDetails();
}
}
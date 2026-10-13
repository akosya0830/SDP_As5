package Facade;

public class TicketSystem {
    public void checkTickets() {
        System.out.println("🎫 Билетная система: Проверка билетов завершена. Все зрители на своих местах.");
    }

    public void lockDoors() {
        System.out.println("🚪 Безопасность: Входные двери в кинозал заблокированы на время сеанса.");
    }

    public void unlockDoors() {
        System.out.println("🚪 Безопасность: Входные двери разблокированы, зрители могут выходить.");
    }
}

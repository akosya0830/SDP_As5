package abstractfactory;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " тг. наличными на кассе (Offline).");
    }
}

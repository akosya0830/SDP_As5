package abstractfactory;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " тг. через банковскую карту (Online).");
    }
}

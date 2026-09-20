package abstractfactory;

public class OfflineBookingFactory implements BookingFactory {
    @Override
    public Payment createPayment() {
        return new CashPayment();
    }

    @Override
    public Delivery createDelivery() {
        return new PaperDelivery();
    }
}

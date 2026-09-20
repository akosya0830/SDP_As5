package abstractfactory;

public class OnlineBookingFactory implements BookingFactory {
    @Override
    public Payment createPayment() {
        return new CardPayment();
    }

    @Override
    public Delivery createDelivery() {
        return new EmailDelivery();
    }
}

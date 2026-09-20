package abstractfactory;

public interface BookingFactory {
    Payment createPayment();
    Delivery createDelivery();
}

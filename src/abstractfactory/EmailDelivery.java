package abstractfactory;

public class EmailDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Электронный билет отправлен на ваш Email.");
    }
}

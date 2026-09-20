package abstractfactory;

public class PaperDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Бумажный билет распечатан и выдан на кассе.");
    }
}

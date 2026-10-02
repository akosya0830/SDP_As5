package bridge;

public class PromoAlert extends Notification {
    private String promoCode;

    public PromoAlert(MessageSender sender, String promoCode) {
        super(sender);
        this.promoCode = promoCode;
    }

    @Override
    public void send() {
        String message = "Скидка 20% на попкорн по промокоду: " + promoCode;
        sender.sendMessage(message);
    }
}
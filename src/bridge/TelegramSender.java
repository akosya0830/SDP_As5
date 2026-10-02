package bridge;

public class TelegramSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("✈️ Отправка в Telegram: " + message);
    }
}

package bridge;

public class MainClient {
    public static void main(String[] args) {
        // Создаем способы отправки
        MessageSender emailSender = new EmailSender();
        MessageSender telegramSender = new TelegramSender();

        // 1. Отправляем подтверждение бронирования через Email
        Notification bookingInfo = new BookingConfirmation(emailSender, "Дюна 2");
        bookingInfo.send();

        // 2. Отправляем промокод через Telegram
        Notification promoAlert = new PromoAlert(telegramSender, "CINEMA20");
        promoAlert.send();

        // 3. Динамически меняем реализацию (тот же промокод, но теперь на Email)
        Notification promoEmail = new PromoAlert(emailSender, "CINEMA20");
        promoEmail.send();
    }
}
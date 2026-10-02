package bridge;

public class BookingConfirmation extends Notification {
    private String movieTitle;

    public BookingConfirmation(MessageSender sender, String movieTitle) {
        super(sender);
        this.movieTitle = movieTitle;
    }

    @Override
    public void send() {
        String message = "Ваш билет на фильм '" + movieTitle + "' успешно забронирован!";
        sender.sendMessage(message);
    }
}
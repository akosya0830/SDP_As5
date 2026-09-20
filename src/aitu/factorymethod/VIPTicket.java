package aitu.factorymethod;

public class VIPTicket implements Ticket {
    private static final double VIP_PRICE = 3000.0;
    private String movieName;

    public VIPTicket(String movieName) {
        if (movieName == null || movieName.trim().isEmpty()) {
            throw new IllegalArgumentException("Название фильма обязательно");
        }
        this.movieName = movieName;
    }

    @Override
    public String getDetails() {
        return "VIP билет (с доступом в лаунж) на фильм: " + movieName;
    }

    @Override
    public double getPrice() {
        return VIP_PRICE;
    }
}

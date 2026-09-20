package aitu.factorymethod;

import aitu.factorymethod.Ticket;

public class StandardTicket implements Ticket {
    // Clean Code: No magic numbers (избегаем хардкода чисел в логике)
    private static final double BASE_PRICE = 1500.0;
    private String movieName;

    public StandardTicket(String movieName) {
        // Clean Code: Validated construction (проверка состояния при создании)
        if (movieName == null || movieName.trim().isEmpty()) {
            throw new IllegalArgumentException("Название фильма обязательно");
        }
        this.movieName = movieName;
    }

    @Override
    public String getDetails() {
        return "Стандартный билет на фильм: " + movieName;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE;
    }
}
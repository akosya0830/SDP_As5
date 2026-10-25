package strategy;

public class TicketOrder {
    private String movieName;
    private double basePrice;
    private PricingStrategy pricingStrategy; // Храним ссылку на интерфейс (агрегация)

    public TicketOrder(String movieName, double basePrice, PricingStrategy pricingStrategy) {
        this.movieName = movieName;
        this.basePrice = basePrice;
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateFinalPrice() {
        return pricingStrategy.calculatePrice(basePrice);
    }

    public void printOrderDetails() {
        System.out.println("Фильм: " + movieName);
        System.out.println("Итоговая цена: " + calculateFinalPrice() + " тг.");
        System.out.println("-------------------------");
    }
}
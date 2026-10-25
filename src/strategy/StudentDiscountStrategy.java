package strategy;

public class StudentDiscountStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.80;
    }
}
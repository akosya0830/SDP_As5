package strategy;

public class VipPremiumStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 1.50;
    }
}
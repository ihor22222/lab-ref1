public class DefaultDiscount implements DiscountStrategy {
    @Override
    public double getDiscountPercentage() {
        return 0.05; // Загальна знижка для інших категорій
    }
}

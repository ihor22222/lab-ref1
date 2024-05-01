public class ClothingDiscount implements DiscountStrategy {
    @Override
    public double getDiscountPercentage() {
        return 0.2; // 20% знижка для одягу
    }
}

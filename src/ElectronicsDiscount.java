public class ElectronicsDiscount implements DiscountStrategy {
    @Override
    public double getDiscountPercentage() {
        return 0.1; // 10% знижка для електроніки
    }
}


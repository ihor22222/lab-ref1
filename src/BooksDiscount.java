public class BooksDiscount implements DiscountStrategy {
    @Override
    public double getDiscountPercentage() {
        return 0.15; // 15% знижка для книг
    }
}

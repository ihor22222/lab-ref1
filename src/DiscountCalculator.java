import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private Map<String, DiscountStrategy> discountStrategies = new HashMap<>();

    public DiscountCalculator() {
        discountStrategies.put("Electronics",  new ElectronicsDiscount());
        discountStrategies.put("Clothing",  new ClothingDiscount());
        discountStrategies.put("Books",  new BooksDiscount());
    }

    public double getDiscountPercentage(String category) {
        return discountStrategies.getOrDefault(category, new DefaultDiscount()).getDiscountPercentage();
    }
}

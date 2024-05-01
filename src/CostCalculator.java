public class CostCalculator {
    public double calculateTotalCost(Product... products) {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getQuantity() * product.getPrice();
        }
        return totalCost;
    }
}

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Відсоток знижки на електроніку: " + calculator.getDiscountPercentage("Electronics"));
        System.out.println("Відсоток знижки на одяг: " + calculator.getDiscountPercentage("Clothing"));
        System.out.println("Відсоток знижки на книги: " + calculator.getDiscountPercentage("Books"));
        System.out.println("Відсоток знижки на інщі категорії: " + calculator.getDiscountPercentage("Unknown"));
    }
}

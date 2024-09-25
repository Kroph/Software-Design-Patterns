interface Product {
    double getDiscount();
    double getPrice();
}

class FoodProduct implements Product {
    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return this.price * 0.1;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

class ElectronicsProduct implements Product {
    private double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return this.price * 0.05;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

class ClothingProduct implements Product {
    private double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return this.price * 0.15;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        Product foodProduct = new FoodProduct(10);
        Product electronicsProduct = new ElectronicsProduct(500);
        Product clothingProduct = new ClothingProduct(100);

        System.out.println("Food: " + discountCalculator.calculateDiscount(foodProduct));
        System.out.println("Electronics: " + discountCalculator.calculateDiscount(electronicsProduct));
        System.out.println("Clothing: " + discountCalculator.calculateDiscount(clothingProduct));
    }
}
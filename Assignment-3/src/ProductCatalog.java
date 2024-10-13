import java.util.HashMap;
import java.util.Map;

class ProductCatalog {
    private Map<String, Double> products = new HashMap<>();

    public ProductCatalog() {
        // Initializing some products
        products.put("Laptop", 1200.00);
        products.put("Phone", 800.00);
        products.put("Tablet", 400.00);
    }

    public double getProductPrice(String productName) {
        return products.getOrDefault(productName, 0.0);
    }

    public boolean isProductAvailable(String productName) {
        return products.containsKey(productName);
    }
}
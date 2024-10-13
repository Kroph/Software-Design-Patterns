class ShippingService {
    public double calculateShippingCost(String productName) {
        return 1.0; // Flat rate shipping
    }

    public void shipProduct(String productName) {
        System.out.println("Shipping " + productName + "...");
    }
}
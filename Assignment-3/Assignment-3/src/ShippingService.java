class ShippingService {
    public double calculateShippingCost(String productName) {
        return 10.0;
    }

    public void shipProduct(String productName) {
        System.out.println("Shipping " + productName + "...");
    }
}
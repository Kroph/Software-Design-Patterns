class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public String placeOrder(String productName) {
        if (!productCatalog.isProductAvailable(productName)) {
            return "Product not available";
        }

        if (!inventoryManager.checkStock(productName)) {
            return "Insufficient stock for " + productName;
        }

        double price = productCatalog.getProductPrice(productName);
        if (!paymentProcessor.processPayment(price)) {
            return "Payment failed for " + productName;
        }

        inventoryManager.reduceStock(productName);
        double shippingCost = shippingService.calculateShippingCost(productName);
        shippingService.shipProduct(productName);

        return "Order placed successfully for " + productName + ". Total cost: $" + (price + shippingCost);
    }
}
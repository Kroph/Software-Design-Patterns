public class ShoppingClient {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        String productName = "Phone";
        String orderResult = shoppingFacade.placeOrder(productName);
        System.out.println(orderResult);
    }
}
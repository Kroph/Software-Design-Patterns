import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("Laptop", 5);
        inventory.put("Phone", 10);
        inventory.put("Tablet", 2);
    }

    public boolean checkStock(String productName) {
        return inventory.getOrDefault(productName, 0) > 0;
    }

    public void reduceStock(String productName) {
        if (checkStock(productName)) {
            inventory.put(productName, inventory.get(productName) - 1);
            System.out.println("Reduced stock for " + productName);
        }
    }
}
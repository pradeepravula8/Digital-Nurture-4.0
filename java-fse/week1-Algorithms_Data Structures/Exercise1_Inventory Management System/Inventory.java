import java.util.*;
class Inventory {
    HashMap<Integer, Product> inventory = new HashMap<>();
 void addProduct(Product p) {
        if (inventory.containsKey(p.id)) {
            System.out.println("Product ID already exists. Cannot add.");
        } else {
            inventory.put(p.id, p);
            System.out.println("Added product: " + p.name);
        }
    }

 void updateProduct(int id, String newName, int newQty, double newPrice) {
        Product p = inventory.get(id);
        if (p != null) {
            p.setName(newName);
            p.setQuantity(newQty);
            p.setPrice(newPrice);
            System.out.println("Updated product: " + id);
        } else {
            System.out.println("Product not found.");
        }
    }

void deleteProduct(int id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Deleted product with ID: " + id);
        } else {
            System.out.println("Product not found, can’t delete.");
        }
    }

void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Nothing in inventory.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}

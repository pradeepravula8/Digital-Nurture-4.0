
public class Main {
public static void main(String[] args) {
Inventory manager = new Inventory();  
Product rice = new Product(101, "Rice Bag", 50, 1200.0);
Product wheat = new Product(102, "Wheat Bag", 40, 1100.0);
manager.addProduct(rice);
manager.addProduct(wheat);

System.out.println("Initial Inventory:");

manager.displayInventory();
manager.updateProduct(101, "Rice Bag Premium", 60, 1250.0);
manager.deleteProduct(102);
System.out.println("Final Inventory:");
manager.displayInventory();
    }
}

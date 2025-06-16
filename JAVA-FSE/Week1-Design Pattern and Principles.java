// Singleton class that allows only one instance
class SimplePrinter {
    // Step 1: Create a private static instance
    private static SimplePrinter instance;

    // Step 2: Private constructor to prevent object creation from outside
    private SimplePrinter() {
        System.out.println("SimplePrinter Initialized");
    }

    // Step 3: Public method to get the single instance
    public static SimplePrinter getInstance() {
        if (instance == null) {
            instance = new SimplePrinter();
        }
        return instance;
    }

    // Method to simulate printing
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

// Main class to test the Singleton
public class SimpleSingleton {
    public static void main(String[] args) {
        // Get Singleton instance
        SimplePrinter printer1 = SimplePrinter.getInstance();
        SimplePrinter printer2 = SimplePrinter.getInstance();

        // Use the instance
        printer1.print("Singleton Pattern - Week 1");
        printer2.print("Hands-on Assignment");

        // Check if both instances are same
        if (printer1 == printer2) {
            System.out.println("Both printers are the same instance.");
        } else {
            System.out.println("Different instances created!");
        }
    }
}

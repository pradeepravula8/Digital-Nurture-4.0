public class Main {
public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 1500.50),
            new Order(102, "Bob", 750.75),
            new Order(103, "Charlie", 2350.90),
            new Order(104, "Diana", 1200.00)
        };

Order[] bubbleSorted = orders.clone();
Order[] quickSorted = orders.clone();
System.out.println("Original Orders:");
        printOrders(orders);

System.out.println("\nSorted by Bubble Sort:");
BubbleSort.sort(bubbleSorted);
        printOrders(bubbleSorted);

        
System.out.println("\nSorted by Quick Sort:");
QuickSort.sort(quickSorted, 0, quickSorted.length - 1);
        printOrders(quickSorted);
    }
    static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

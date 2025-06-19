import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {

 ShopData[] items = new ShopData[6];
 items[0] = new ShopData(301, "Smartwatch", "Electronics");
 items[1] = new ShopData(302, "Office Chair", "Furniture");
 items[2] = new ShopData(303, "Bluetooth Speaker", "Electronics");
 items[3] = new ShopData(304, "Water Bottle", "Kitchen");
 items[4] = new ShopData(305, "Notebook", "Stationery");
 items[5] = new ShopData(306, "Running Shoes", "Footwear");

        
 System.out.println(" LINEAR SEARCH");
 ShopData result1 = ItemFinder.linearSearch(items, "Notebook");
 if (result1 != null) {
System.out.println("Found: " + result1);
}
else {
System.out.println("Item not found using linear search.");
}

Arrays.sort(items, Comparator.comparing(p -> p.productName.toLowerCase()));

System.out.println("\n BINARY SEARCH");
ShopData result2 = ItemFinder.binarySearch(items, "Notebook");
if (result2 != null) {
System.out.println("Found: " + result2);
} 
else {
System.out.println("Item not found using binary search.");
}
if (result1 == result2) {
System.out.println("\n Both searches found the same item.");
        }
    }
}

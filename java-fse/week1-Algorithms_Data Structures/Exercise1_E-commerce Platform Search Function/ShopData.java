public class ShopData {
int productId;
String productName;
String category;

public ShopData(int id, String name, String type) {
productId = id;
productName = name;
category = type;
    }
public String toString() {
return "ShopItem{" +
"ID=" + productId +
", Name='" + productName + '\'' +
", Category='" + category + '\'' +
'}';
    }
}

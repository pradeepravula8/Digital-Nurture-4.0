class Product {
    int id;
    String name;
    int quantity;
    double price;

Product(int id, String name, int quantity, double price) {
this.id = id;
this.name = name;
this.quantity = quantity;
this.price = price;
    }

void setName(String newName) {
name = newName;
    }
void setQuantity(int newQty) {
quantity = newQty;
    }
void setPrice(double newPrice) {
price = newPrice;
    }
public String toString() {
return "[ID=" + id + ", Name=" + name + ", Qty=" + quantity + ", Price=" + price + "]";
    }
}

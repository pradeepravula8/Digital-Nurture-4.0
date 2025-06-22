class Order {
    int orderId;             
    String customerName;     
    double totalPrice;       

    
    Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }
    public String toString() {
        return "Order[ID=" + orderId + ", Customer=" + customerName + ", Price=" + totalPrice + "]";
    }
}

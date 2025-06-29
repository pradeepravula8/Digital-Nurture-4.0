package com.example;


public class OrderService {
    private LoggerService loggerService;

    public OrderService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void placeOrder(String orderId) {
        // Some order logic
        loggerService.log("Order placed: " + orderId);
    }
}

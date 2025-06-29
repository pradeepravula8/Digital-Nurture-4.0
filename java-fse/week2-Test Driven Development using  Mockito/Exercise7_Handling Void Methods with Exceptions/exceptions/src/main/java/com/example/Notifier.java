package com.example;

public class Notifier {
    public void alert(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Message cannot be null");
        }
        System.out.println("Alert sent: " + message);
    }
}

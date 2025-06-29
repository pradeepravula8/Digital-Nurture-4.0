package com.example;

public class UserService {
    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String email) {
        // Some registration logic
        notificationService.send(email, "Welcome to our platform!");
    }
}


package com.example;

public class AlertManager {
    private Notifier notifier;

    public AlertManager(Notifier notifier) {
        this.notifier = notifier;
    }

    public void process(String message) {
        notifier.alert(message);
    }
}

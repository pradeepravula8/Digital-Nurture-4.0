package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.library.controller.LibraryController;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring context from XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the controller bean from the Spring context
        LibraryController controller = context.getBean(LibraryController.class);

        // Trigger a sample action
        controller.addBook("Effective Java");
    }
}

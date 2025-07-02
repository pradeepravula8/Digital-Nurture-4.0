### 📚 Library Management System (Spring Framework - Maven & XML Config)
 
This is a Spring-based Java application demonstrating Dependency Injection, AOP (Aspect-Oriented Programming), and WebMVC configuration using XML in a Maven project structure.

## 📆 Overview
This project is designed as part of Exercise 4 to learn:

How to set up a Maven-based Java application

Configure Spring’s Context, AOP, and WebMVC modules

Define beans using applicationContext.xml

Use exec-maven-plugin to run the application

### 🎓 Learning Objectives
Create and configure a Maven project from scratch

Add Spring dependencies via pom.xml

Use XML to wire beans and configure dependencies

Implement a layered architecture using Controller, Service, and Repository

Use AOP (e.g., logging with method execution)

Setup Maven plugins for Java 1.8

### 📊 Technologies Used
Tool/Technology	Purpose
Java 8+	Programming Language
Spring Context	Dependency Injection
Spring AOP	Aspect-Oriented Programming
Spring WebMVC	Web Layer Architecture
Maven	Build & Dependency Management
VS Code / IntelliJ	Development IDE

📁 Project Structure

librarymanagement/
├── pom.xml                              
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/library/
    │   │       ├── LibraryManagementApplication.java   # Main class
    │   │       ├── controller/
    │   │       │   └── LibraryController.java
    │   │       ├── service/
    │   │       │   └── BookService.java
    │   │       ├── repository/
    │   │       │   └── BookRepository.java
    │   │       
    │   │                     
    │   └── resources/
    │       └── applicationContext.xml                  
    └── test/
        └── java/
            └── com/example/library/
                └── AppTest.java                        # (Optional) Unit test



### 🚀 How to Run the Project
✅ Prerequisites
Java 8 installed and configured

Maven installed

IDE (e.g., IntelliJ, VS Code)

✅ Steps
1.Clone/Download the Project

2.Build the Project

bash

'''mvn clean install

3.Run the Application

''''mvn exec:java


